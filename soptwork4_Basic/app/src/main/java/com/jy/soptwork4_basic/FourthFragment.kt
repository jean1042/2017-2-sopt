package com.jy.soptwork4_basic

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragmentfourth.view.*

/**
 * Created by jean1 on 2017-11-22.
 */
class FourthFragment : Fragment() {
    //activity 의 oncreate 와 같은 기능
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //inflater 통해 xml 가져옴_ 우리가 만든 xml을 inflater에서 쓸 수 있게끔 해주는 것
        val v = inflater!!.inflate(R.layout.fragmentfourth, container, false)
        if (arguments!=null){
            v!!.fourth_text.text=arguments.getString("title")
        }
        return v
    }

}