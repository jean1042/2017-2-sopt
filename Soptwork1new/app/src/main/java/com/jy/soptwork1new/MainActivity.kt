package com.jy.soptwork1new

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var nextButton : Button? = null
    private var mainEdit : EditText ? = null
    private var editContext : String = ""
    private val TAG : String = "Main"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.main_next_button) as Button
        mainEdit = findViewById(R.id.main_edit) as EditText
        nextButton!!.setOnClickListener {
            editContext = mainEdit!!.text.toString()
            val intent = Intent(applicationContext, MainActivity2::class.java)

            intent.putExtra("firstText", editContext) //Main2Activity로 firstText라는 키를 통해 전달
            intent.putExtra("mainText", editContext)
            startActivity(intent)
        }
    }
}
