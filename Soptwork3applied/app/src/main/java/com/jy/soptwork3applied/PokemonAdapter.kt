package com.jy.soptwork3applied

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*

/**
 * Created by jean1 on 2017-10-31.
 */
class PokemonAdapter (var dataList:ArrayList<PokemonData>?) : RecyclerView.Adapter<PokemonViewholder>(){

    private var onItemClick : View.OnClickListener?=null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PokemonViewholder {
    val mainView : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.pokemonitemlists, parent, false ) //이 viewholder를 쓴다고 생각하면 됨
        mainView.setOnClickListener(onItemClick)
        return PokemonViewholder(mainView)

    }
/*adapter를 통해서 view 와 데이터를 연결*/
    /*
      *각 순번에 맞게 들어가도록 */

    override fun onBindViewHolder(holder: PokemonViewholder?, position: Int) {
      holder!!.pokemonImage.setImageResource(dataList!!.get(position).pokemonImage)
    holder!!.pokemonName.setText(dataList!!.get(position).pokemonName)
    holder!!.pokemonType.setText(dataList!!.get(position).pokemonType)

    }

    override fun getItemCount(): Int = dataList!!.size

    fun setOnItemClickListener(l:View.OnClickListener){
        onItemClick=l
    }

}