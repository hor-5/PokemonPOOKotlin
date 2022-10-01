package com.example.pokemonpoo

class Pikachu(idPokemon:Int, nombre:String,tipoPrincipal:Tipo,
              tipoSecundario:Tipo?, salud:Int,capAtaque:Int,
              capDefensa:Int,peso:Double,altura:Double,nivel:Int,
              evoluciones:List<String>,descripcion:String,nivelDeEstabilidad:String)
            : //indicamos la herencia ->
            Pokemon(idPokemon, nombre,tipoPrincipal,
                tipoSecundario, salud,capAtaque,
                capDefensa,peso,altura,nivel,
                evoluciones,descripcion)
{
    //comienza el cuerpo de la clase
    var nivelDeEstabilidad:String = nivelDeEstabilidad

    override fun evolucionar(){
        if (this.nivel<30){
            println("${this.nombre} todavia no está listo para evolucionar, necesita subir ${30-this.nivel} niveles más")
        }
        else if(this.nivel>=30){
            println("${this.nombre} está listo!")
            println("${this.nombre} está evolucionando a ${this.evoluciones[0]}")
        }
    }

}