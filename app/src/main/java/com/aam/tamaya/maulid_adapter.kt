package com.aam.tamaya

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class maulid_adapter (fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 2

    override fun createFragment(position: Int): Fragment {
        when (position ){
            0 -> {return Maulid()}
            1 -> {return Doa()}
            else -> {return Maulid()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}