package com.aam.tamaya

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.maulid_item.*
import kotlinx.android.synthetic.main.yasin_item.*

class adapter_rc_maulid (private val context: Context, private val items:ArrayList<maulid_model>):
    RecyclerView.Adapter<adapter_rc_maulid.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.maulid_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))

    }

    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: maulid_model) {
            var imgg = item.gm_maulid
            imgmaulid.setImageResource(imgg)


        }
    }
}

