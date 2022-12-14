package com.example.pokemonpoo
import java.util.Random

class CampoDeBatalla(idCampoDeBatalla: Int,nombre:String,localizacion:String,pokemones:ArrayList<Pokemon>) {
    var idCampoDeBatalla:Int = idCampoDeBatalla
    var nombre: String = nombre
    var localizacion:String = localizacion
    var pokemones:ArrayList<Pokemon> = pokemones


    fun getPokemonesEnBatalla(){
        pokemones.forEach {
            println(it)
        }
    }

    fun comenzarBatalla(){
        if (pokemones.size > 1){
            var pokemon1:Pokemon = pokemones[0]
            var pokemon2:Pokemon = pokemones[1]
            println("\nComenzando la batalla entre ${pokemon1.nombre.toUpperCase()} y ${pokemon2.nombre.toUpperCase()}")
            var random = Random()
            var batalla: Boolean = true
            while (batalla){
                var numAleatorio:Int= random.nextInt(4)+1// numero aleatorio entre 1 y 4
                //primer pokemon ataca
                pokemon1.atacar(pokemon2)
                //defensa aleatoria
                if (numAleatorio==1 || numAleatorio==3 && pokemon2.salud > pokemon2.capacidadDefensa){
                    pokemon2.defenderse()
                }
                //segundo pokemon ataca
                pokemon2.atacar(pokemon1)
                //defensa aleatoria
                if (numAleatorio==2 || numAleatorio ==4 && pokemon1.salud > pokemon1.capacidadDefensa){
                    pokemon1.defenderse()
                }

                //chequeamos si algun pokemon se quedó sin salud
                if (pokemon1.salud<=0 || pokemon2.salud<=0){
                    batalla = false
                }else{
                    for (pokemon in pokemones){
                        println("${pokemon.nombre.toUpperCase()} : ${pokemon.salud} salud ")
                    }
                }

            }

            mostrarGanador(pokemon1,pokemon2)


        }else{
            println("Se necesitan dos pokemones para poder batallar!")
        }
    }

    fun mostrarGanador(pokemon1:Pokemon, pokemon2:Pokemon){

        var pokemonGanador:Pokemon = if(pokemon1.salud>0){pokemon1}else{pokemon2}

        println("Batalla finalizada!")
        println("El ganador es ${pokemonGanador.nombre}, resistió quedando con ${pokemonGanador.salud} puntos de salud.")
    }
}