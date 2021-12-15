package com.aam.tamaya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.main_tahlil_yasin.*

class main_tahlil_yasin : AppCompatActivity(){
    val menuteks = arrayOf(" Yasin ", "Tahlil")
    val menuicon = arrayOf(R.drawable.ic_allah, R.drawable.ic_book)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_tahlil_yasin)

        val adapter = tahlil_yasin_adapter (this)
        view_pager.setAdapter( adapter )
        TabLayoutMediator(tab_layout, view_pager,
        TabLayoutMediator.TabConfigurationStrategy{tab, position ->
            tab.text=menuteks[position]
            tab.icon=ResourcesCompat.getDrawable(resources, menuicon[position], null)
        }).attach()
    }

}
