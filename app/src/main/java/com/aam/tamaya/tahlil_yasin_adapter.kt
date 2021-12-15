package com.aam.tamaya

import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class tahlil_yasin_adapter(fragmentActivity: FragmentActivity ):
FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 2

    override fun createFragment(position: Int): Fragment {
        when (position ){
            0 -> {return  Yasin()}
            1 -> {return Tahlil()}
            else -> {return Yasin()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}
