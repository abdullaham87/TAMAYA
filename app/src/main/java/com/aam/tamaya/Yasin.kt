package com.aam.tamaya

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.yasin.*

class Yasin : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.yasin, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()

    }
    lateinit var listTeman:ArrayList<yasin_model>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(yasin_model(R.drawable.yasin1))
        listTeman.add(yasin_model(R.drawable.yasin2))
        listTeman.add(yasin_model(R.drawable.yasin3))
        listTeman.add(yasin_model(R.drawable.yasin4))
        listTeman.add(yasin_model(R.drawable.yasin5))
        listTeman.add(yasin_model(R.drawable.yasin6))
        listTeman.add(yasin_model(R.drawable.yasin7))
        listTeman.add(yasin_model(R.drawable.yasin8))
        listTeman.add(yasin_model(R.drawable.yasin9))
    }

    private fun tampilTeman(){
        rv_yasin.layoutManager= LinearLayoutManager(requireContext())
        rv_yasin.adapter=adapter_rc_yasin(requireContext(), listTeman)
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