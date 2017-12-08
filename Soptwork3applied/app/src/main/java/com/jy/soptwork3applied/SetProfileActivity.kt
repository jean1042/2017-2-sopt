package com.jy.soptwork3applied

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by jean1 on 2017-11-01.
 */
class SetProfileActivity : AppCompatActivity(){

    private var myIm : ImageView?=null //포켓몬 이미지 담을 그릇

    private var textName : TextView?=null
    var realname : String? = null

    private var textType : TextView?=null
    var realtype : String? = null

    private var textScript : TextView?=null
    var realdescription : String? = null

    private val TAG : String = "profilepage"

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setprofile_pokemon) //xml과 연결

        profileActivity()
    }

    fun profileActivity(){

        val intent = Intent(applicationContext, MainActivity::class.java)

        /*myIm=findViewById(R.id.pokemon_list_image) as ImageView
        ImageView.setImageView(intent.getIntExtra("image1", R.drawable.image1))
*/
        textName=findViewById(R.id.pokemon_list_name) as TextView
        realname=intent.getStringExtra("name")

        textType=findViewById(R.id.pokemon_list_type) as TextView
        realtype=intent.getStringExtra("type")

        textScript=findViewById(R.id.pokemon_list_type) as TextView
        realdescription=intent.getStringExtra("description")


        textName!!.text=getIntent().getStringExtra("")
    }

}