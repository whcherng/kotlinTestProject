package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.segment_quick_payment.view.*

class AccountDetailsAdapter(private val accountDetails: List<Item>, private val listener: (Item) -> Unit) : RecyclerView.Adapter<AccountDetailsViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): AccountDetailsViewHolder = AccountDetailsViewHolder(
        LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.segment_account_details, viewGroup, false)
    )

    override fun onBindViewHolder(viewHolder: AccountDetailsViewHolder, i: Int) =
        viewHolder.bind(accountDetails[i], listener)

    override fun getItemCount(): Int {
        return accountDetails.size
    }
}

class AccountDetailsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: Item, listener: (Item) -> Unit) = with(itemView) {
        //tvTitle.text = item.itemTitle
        //ivIcon.setImage=item.itemTitle
        setOnClickListener { listener(item) }
    }
}
