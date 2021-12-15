package com.aam.tamaya

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.maulid.*
import kotlinx.android.synthetic.main.yasin.*

class Maulid : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.maulid, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iniView()
    }
    lateinit var listTeman:ArrayList<maulid_model>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(maulid_model(R.drawable.maulid1))
        listTeman.add(maulid_model(R.drawable.maulid2))
        listTeman.add(maulid_model(R.drawable.maulid3))
        listTeman.add(maulid_model(R.drawable.maulid4))
        listTeman.add(maulid_model(R.drawable.maulid5))
        listTeman.add(maulid_model(R.drawable.maulid6))
        listTeman.add(maulid_model(R.drawable.maulid7))
        listTeman.add(maulid_model(R.drawable.maulid8))
        listTeman.add(maulid_model(R.drawable.maulid9))
        listTeman.add(maulid_model(R.drawable.maulid10))
        listTeman.add(maulid_model(R.drawable.maulid11))
        listTeman.add(maulid_model(R.drawable.maulid12))
        listTeman.add(maulid_model(R.drawable.maulid13))
        listTeman.add(maulid_model(R.drawable.maulid14))
        listTeman.add(maulid_model(R.drawable.maulid15))
        listTeman.add(maulid_model(R.drawable.maulid16))
        listTeman.add(maulid_model(R.drawable.maulid17))
        listTeman.add(maulid_model(R.drawable.maulid18))
        listTeman.add(maulid_model(R.drawable.maulid19))
        listTeman.add(maulid_model(R.drawable.maulid20))
        listTeman.add(maulid_model(R.drawable.maulid21))
        listTeman.add(maulid_model(R.drawable.maulid22))
        listTeman.add(maulid_model(R.drawable.maulid24))
        listTeman.add(maulid_model(R.drawable.maulid25))
        listTeman.add(maulid_model(R.drawable.maulid26))
        listTeman.add(maulid_model(R.drawable.maulid27))
        listTeman.add(maulid_model(R.drawable.maulid28))
        listTeman.add(maulid_model(R.drawable.maulid29))
        listTeman.add(maulid_model(R.drawable.maulid30))
        listTeman.add(maulid_model(R.drawable.maulid31))
        listTeman.add(maulid_model(R.drawable.maulid32))

    }

    private fun tampilTeman(){
        rv_maulid.layoutManager= LinearLayoutManager(requireContext())
        rv_maulid.adapter=adapter_rc_maulid(requireContext(), listTeman)
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