package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.segment_quick_payment.view.*

class QuickPaymentAdapter(private val quickPayments: List<Item>, private val listener: (Item) -> Unit) : RecyclerView.Adapter<QuickPaymentViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): QuickPaymentViewHolder = QuickPaymentViewHolder(
        LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.segment_quick_payment, viewGroup, false)
    )

    override fun onBindViewHolder(viewHolder: QuickPaymentViewHolder, i: Int) =
        viewHolder.bind(quickPayments[i], listener)

    override fun getItemCount(): Int {
        return quickPayments.size
    }
}

class QuickPaymentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: Item, listener: (Item) -> Unit) = with(itemView) {
        tvTitle.text = item.itemTitle
        //ivIcon.setImage=item.itemTitle
        setOnClickListener { listener(item) }
    }
}
