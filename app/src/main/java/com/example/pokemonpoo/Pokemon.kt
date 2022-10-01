package com.example.pokemonpoo

abstract class Pokemon(
    idPokemon:Int, nombre:String, tipoPrincipal:Tipo,
    tipoSecundario: Tipo?, salud:Int, capAtaque:Int,
    capDefensa:Int, peso:Double, altura:Double, nivel:Int,
    evoluciones:List<String>, descripcion:String)
{

    var idPokemon: Int = idPokemon
    var nombre:String = nombre
    var tipoPrincipal : Tipo = tipoPrincipal
    var tipoSecundario:Tipo? = tipoSecundario
    var salud:Int = salud
    var capacidadAtaque:Int = capAtaque
    var capacidadDefensa:Int =capDefensa
    var peso:Double = peso
    var altura:Double = altura
    var nivel:Int = nivel
    var evoluciones = evoluciones
    var descripcion = descripcion

    fun atacar(pokemon: Pokemon){
        if(pokemon.salud>0  && this.salud > 0){
            if (this.tipoPrincipal.efectividad.contains(pokemon.tipoPrincipal.nombreTipo)){
                println("Los pokemon de tipo ${this.tipoPrincipal.nombreTipo.toUpperCase()} como ${this.nombre} son efectivos contra los de tipo ${pokemon.tipoPrincipal.nombreTipo.toUpperCase()}")
                println("${this.nombre.toUpperCase()} le infringe el doble de daño a ${pokemon.nombre.toUpperCase()}")
                println("${this.nombre.capitalize()} tiene ${this.salud} de salud y está atacando...")
                pokemon.salud-=(this.capacidadAtaque*2)
            }else{
                println("${this.nombre.capitalize()} tiene ${this.salud} de salud y está atacando...")
                pokemon.salud-=this.capacidadAtaque
            }

        }else{
            if (pokemon.salud<=0){
                println("El pokemon ${pokemon.nombre.toUpperCase()} ha sido derrotado por ${this.nombre.toUpperCase()}")
            }
            else if(this.salud<=0){
                println("El pokemon ${this.nombre.toUpperCase()} ha sido derrotado por ${pokemon.nombre.toUpperCase()}")
            }

        }
    }
    fun defenderse(){
        if (this.salud>0){
            println("${this.nombre.capitalize()} se está defendiendo y recuperando salud, ahora tiene ${this.salud} de salud")
            this.salud+=this.capacidadDefensa
        }else{
            println("${this.nombre} ha sido derrotado...")
        }
    }
    fun entrenar(){
        println("${this.nombre.capitalize()} nivel ${this.nivel} está entrenando... ")
        this.nivel++
        println("${this.nombre.capitalize()} subió un nivel, ahora es nivel ${this.nivel}.")
    }
    abstract fun evolucionar()

}