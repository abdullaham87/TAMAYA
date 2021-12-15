package com.aam.tamaya

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.tahlil_item.*

class adapter_rc_tahlil (private val context: Context, private val items:ArrayList<tahlil_model>):
    RecyclerView.Adapter<adapter_rc_tahlil.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.tahlil_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))

    }

    class ViewHolder(override val containerView: View):
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item:tahlil_model) {
            var imgg = item.gm_tahlil
            imgTahlil.setImageResource(imgg)


        }
    }
}