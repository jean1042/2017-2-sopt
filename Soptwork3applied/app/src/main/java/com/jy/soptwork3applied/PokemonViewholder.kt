package com.jy.soptwork3applied

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by jean1 on 2017-10-31.
 */
class PokemonViewholder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
var pokemonImage : ImageView = itemView!!.findViewById(R.id.pokemon_list_image)
var pokemonType : TextView = itemView!!.findViewById(R.id.pokemon_list_type)
var pokemonName : TextView = itemView!!.findViewById(R.id.pokemon_list_name)
}