package com.example.pokemonpoo

class Squirtle(idPokemon:Int, nombre:String,tipoPrincipal:Tipo,
               tipoSecundario:Tipo?, salud:Int,capAtaque:Int,
               capDefensa:Int,peso:Double,altura:Double,nivel:Int,
               evoluciones:List<String>,descripcion:String,durezaCaparazon:String)
                : //indicamos la herencia ->
                Pokemon(idPokemon, nombre,tipoPrincipal,
                    tipoSecundario, salud,capAtaque,
                    capDefensa,peso,altura,nivel,
                    evoluciones,descripcion)
{
  //comienzo cuerpo de la clase
  var durezaCaparazon:String = durezaCaparazon

  override fun evolucionar() {
      if (this.nivel<16){
          println("${this.nombre} todavia no está listo para evolucionar, necesita subir ${16-this.nivel} niveles más")
      }
      else if (this.nivel>=16){
          println("${this.nombre} está listo!")
          println("${this.nombre} está evolucionando a ${this.evoluciones[0]}")
      }
      else if(this.nivel>=36){
          println("${this.nombre} está listo!")
          println("${this.nombre} está evolucionando a ${this.evoluciones[1]}")
      }

    }

    override fun entrenar(intensidad:Int){
        println("${this.nombre.capitalize()} nivel ${this.nivel} está entrenando intensamente... ")
        this.nivel+=intensidad
        println("${this.nombre.capitalize()} subió un nivel, ahora es nivel ${this.nivel}.")
    }

    override fun toString(): String {
        return "Soy un pokemon $nombre, mi id es #$idPokemon soy de tipo ${tipoPrincipal.nombreTipo} tengo $capacidadAtaque puntos de ataque, y la dureza de mi caparazón es $durezaCaparazon"
    }


}