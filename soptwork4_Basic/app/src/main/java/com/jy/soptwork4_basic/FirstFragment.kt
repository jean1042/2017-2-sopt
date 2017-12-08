package com.jy.soptwork4_basic


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragmentfirst.view.*

/**
 * Created by jean1 on 2017-11-22.
 */
class FirstFragment :Fragment(){

    //화면이 잘 작동하는지 확인하는 log
    val TAG : String = "LOG:First"

    //activity 의 oncreate 와 같은 기능
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //inflater 통해 xml 가져옴_ 우리가 만든 xml을 inflater에서 쓸 수 있게끔 해주는 것
        val v = inflater!!.inflate(R.layout.fragmentfirst, container, false)

        if (arguments!=null){
            v!!.first_text.text=arguments.getString("title")
        }
        Log.v(TAG, "onCreateview")
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.v(TAG, "onAttatch")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v(TAG, "onDetach")
    }

}