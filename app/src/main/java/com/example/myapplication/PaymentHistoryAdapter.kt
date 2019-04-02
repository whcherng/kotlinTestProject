package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.segment_quick_payment.view.*

class PaymentHistoryAdapter(private val accountDetails: List<Item>, private val listener: (Item) -> Unit) : RecyclerView.Adapter<PaymentHistoryViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PaymentHistoryViewHolder = PaymentHistoryViewHolder(
        LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.segment_payment_history, viewGroup, false)
    )

    override fun onBindViewHolder(viewHolder: PaymentHistoryViewHolder, i: Int) =
        viewHolder.bind(accountDetails[i], listener)

    override fun getItemCount(): Int {
        return accountDetails.size
    }
}

class PaymentHistoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: Item, listener: (Item) -> Unit) = with(itemView) {
        //tvTitle.text = item.itemTitle
        //ivIcon.setImage=item.itemTitle
        setOnClickListener { listener(item) }
    }
}
