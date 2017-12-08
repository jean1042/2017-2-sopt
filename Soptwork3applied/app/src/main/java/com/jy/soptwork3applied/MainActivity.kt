package com.jy.soptwork3applied

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() , View.OnClickListener{

    private var pokemonList : RecyclerView? = null
    private var pokemonDatas : ArrayList<PokemonData>? = null
    private var adapter : PokemonAdapter? =null

    private var OnItemClick : View.OnClickListener?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pokemonList
        pokemonList=findViewById(R.id.main_list) as RecyclerView
        pokemonList!!.layoutManager=LinearLayoutManager(this)

        //pokemonData
        pokemonDatas = ArrayList<PokemonData>()
        pokemonDatas!!.add(PokemonData(R.drawable.image1,"전기타입", "피카츄"))
        pokemonDatas!!.add(PokemonData(R.drawable.image2,"불타입", "파이리"))
        pokemonDatas!!.add(PokemonData(R.drawable.image3,"물타입", "꼬부기"))
        pokemonDatas!!.add(PokemonData(R.drawable.image4,"전기타입", "이상해씨"))

        adapter = PokemonAdapter(pokemonDatas)

        adapter!!.setOnItemClickListener(this)
        pokemonList!!.adapter=adapter


    }

    override fun onClick(v:View?){
        val idx : Int = pokemonList!!.getChildAdapterPosition(v)
        val name : String? = pokemonDatas!!.get(idx).pokemonName

        val intent = Intent(applicationContext, SetProfileActivity::class.java)
        startActivity(intent)

    }
}
