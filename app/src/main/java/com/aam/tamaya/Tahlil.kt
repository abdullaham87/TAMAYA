package com.aam.tamaya

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.tahlil.*
import kotlinx.android.synthetic.main.yasin.*

class Tahlil : Fragment() {
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tahlil, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iniView()
    }
    lateinit var listTeman:ArrayList<tahlil_model>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(tahlil_model(R.drawable.tahlil1))
        listTeman.add(tahlil_model(R.drawable.tahlil2))
        listTeman.add(tahlil_model(R.drawable.tahlil3))
        listTeman.add(tahlil_model(R.drawable.tahlil4))
        listTeman.add(tahlil_model(R.drawable.tahlil5))
        listTeman.add(tahlil_model(R.drawable.tahlil6))
    }
    private fun tampilTeman(){
        rv_tahlil.layoutManager= LinearLayoutManager(requireContext())
        rv_tahlil.adapter=adapter_rc_tahlil(requireContext(), listTeman)
    }
    private fun iniView(){
        simulasiDataTeman()
        tampilTeman()
    }
    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
