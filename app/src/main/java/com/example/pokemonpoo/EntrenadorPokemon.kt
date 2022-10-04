package com.example.pokemonpoo


class EntrenadorPokemon{
    //comienza el cuerpo de la clase

    var idEntrenador:Int
    var nombre:String
    var apellido:String
    var pokedex: Pokedex?
    var aPokemones: ArrayList<Pokemon>

    init {
        pokedex = Pokedex(0, arrayListOf())
        aPokemones = arrayListOf()
    }


    constructor(idEntrenador:Int,nombre:String, apellido:String)  {
        this.idEntrenador = idEntrenador
        this.nombre = nombre
        this.apellido = apellido
    }

    constructor(idEntrenador:Int, nombre:String, apellido:String,pokedex:Pokedex?,aPokemones:ArrayList<Pokemon>){
        this.idEntrenador = idEntrenador
        this.nombre = nombre
        this.apellido = apellido
        this.pokedex = pokedex
        this.aPokemones = aPokemones
    }

    //metodo para buscar pokemon por nombre dentro del array de pokemones
    private fun buscarPokemon(nombrePokemon: String):Pokemon?{
        var pokemonSeleccionado: Pokemon? = null
        for (pokemon in aPokemones){
            if (pokemon.nombre.equals(nombrePokemon)){
                pokemonSeleccionado = pokemon
            }
        }
        if (pokemonSeleccionado==null){
            println("el entrenador no tiene a $nombrePokemon")
        }
        return pokemonSeleccionado
    }


    fun elegirPokemon(nombrePokemon:String):Pokemon?{
        return buscarPokemon(nombrePokemon)
    }

    fun elegirPokemon(tipo: Tipo):Pokemon{
        var pokemonSeleccionado : Pokemon? = null
        for (pokemon in aPokemones){
            if (tipo.nombreTipo == pokemon.tipoPrincipal.nombreTipo){
                pokemonSeleccionado = pokemon
                break
            }
        }
        return pokemonSeleccionado!!
    }

    fun entrenarPokemon(nombrePokemon:String){
        var pokemonSeleccionado:Pokemon? = buscarPokemon(nombrePokemon)
        if (pokemonSeleccionado!=null){
            pokemonSeleccionado.entrenar()
        }
    }

    fun entrenarPokemon(pokemon:Pokemon,intensidad:Int=0){
        try{
            var pokemonSeleccionado:Pokemon = aPokemones[aPokemones.indexOf(pokemon)]
            pokemonSeleccionado.entrenar(intensidad)
        }catch(e:Error){
            println(e.message)
        }
    }



}