package com.example.pokemonpoo

class Pokedex(idPokedex: Int,pokemonesRegistrados:ArrayList<Pokemon>) {
    var idPokedex:Int=idPokedex
    var pokemonesRegistrados:ArrayList<Pokemon> = pokemonesRegistrados

    fun registrarPokemon(pokemon:Pokemon){
        println("Buscando a ${pokemon.nombre} en la pokedex")
        pokemonesRegistrados.add(pokemon)
        println("${pokemon.nombre} registrado!")
        println("información sobre pikachu:")
        println("\n ${pokemon.descripcion}\n")

    }
}