package com.jy.soptwork2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var buttonA : Button? = null
    var buttonB : Button? = null
    var buttonC : Button? = null
    var buttonD : Button? = null
    var buttonE : Button? = null

    var textA : String? = "text_A"
    var textB : String? = "text_B"
    var textC : String? = "text_C"
    var textD : String? = "text_D"
    var textE : String? = "text_E"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
