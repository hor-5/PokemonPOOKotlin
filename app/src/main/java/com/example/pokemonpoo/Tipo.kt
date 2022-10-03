package com.example.pokemonpoo

class Tipo(idTipo:Int,nombreTipo: String) {

    var idTipo:Int = idTipo
    var nombreTipo:String = nombreTipo
    //establecemos la efectividad contra x tipos de pokemon según el tipo de pokemon
    var efectividad:List<String> =
        when(this.nombreTipo){
        "agua" -> {listOf("tierra","fuego","roca")}
        "fuego" -> {listOf("bicho","planta","acero","hielo")}
        "planta" -> {listOf("tierra","roca","agua")}
        "electrico" ->{listOf("volador","agua")}
        "veneno"-> {listOf("planta","hada")}
        else -> {listOf("")}
    }
    //establecemos las debilidad contra X tipos de pokemon según el tipo de pokemon
    var debilidad:List<String> =
        when(this.nombreTipo){
        "agua" -> {listOf("electrico","planta")}
        "fuego" -> {listOf("agua","roca","tierra")}
        "planta" -> {listOf("bicho","fuego","volador","veneno","hielo")}
        "electrico" ->{listOf("tierra")}
        "veneno"-> {listOf("psiquico","tierra")}
        else -> {listOf("")}
    }

    fun esEfectivoContra(nombreTipo:String):Boolean{
        return efectividad.contains(nombreTipo)
    }

    fun esDebilContra(nombreTipo:String):Boolean{
        return debilidad.contains(nombreTipo)
    }


}