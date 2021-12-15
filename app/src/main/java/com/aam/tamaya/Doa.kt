package com.aam.tamaya

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.doa.*
import kotlinx.android.synthetic.main.tahlil.*

class Doa : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.doa, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()
    }
    lateinit var listTeman:ArrayList<doa_model>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(doa_model(R.drawable.doa1))
        listTeman.add(doa_model(R.drawable.doa2))
        listTeman.add(doa_model(R.drawable.doa3))
        listTeman.add(doa_model(R.drawable.doa4))
    }
    private fun tampilTeman(){
        rv_doa.layoutManager= LinearLayoutManager(requireContext())
        rv_doa.adapter=adapter_rc_doa(requireContext(), listTeman)
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
