package com.example.pokemonpoo

fun main() {
    //titulo
    println("                                  ,'\\\n" +
            "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
            "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
            "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
            " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
            "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
            "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
            "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
            "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
            "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
            "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
            "                                `'                            '-._|\n")
    //creamos los tipos de pokemon
    var tipoPlanta: Tipo = Tipo(3, "planta")
    var tipoAgua: Tipo = Tipo(2, "agua")
    var tipoFuego: Tipo = Tipo(1, "fuego")
    var tipoVeneno: Tipo = Tipo(8, "veneno")
    var tipoElectrico: Tipo = Tipo(5, "electrico")

    //----Creamos los cuatro pokemones----

    //Creando a bulbasaur
    var bulbasaur:Bulbasaur = Bulbasaur(1,"bulbasaur",tipoPlanta,tipoVeneno,
                                    318,49,49,6.9,0.7,5,
                                        listOf("ivysaur","venasaur"),
                                "A Bulbasaur es fácil verle echándose una siesta al sol. " +
                                        "La semilla que tiene en el lomo va creciendo cada vez más a medida que absorbe " +
                                        "los rayos del sol."
                                        ,2)

    //Creando a charmander
    var charmander: Charmander = Charmander(4,"charmander",tipoFuego,null,309,52,43,8.5,0.6,10,
                                            listOf("charmeleon","charizard"),"La llama que tiene en la punta de la cola arde según sus sentimientos. " +
                                            "Llamea levemente cuando está alegre y arde vigorosamente cuando está enfadado.","normal")

    //Creando a pikachu
    var pikachu:Pikachu = Pikachu(25,"pikachu",tipoElectrico,null,320,55,40,6.0,0.4,20,
                                    listOf("raichu"),"Cada vez que un Pikachu se encuentra con algo nuevo, le lanza una descarga eléctrica. Cuando " +
                                "se ve alguna baya chamuscada, es muy probable que sea obra de un Pikachu, ya que a veces no controlan la intensidad de la descarga.","alta")
    //Creando a squirtle

    var squirtle:Squirtle = Squirtle(7,"squirtle",tipoAgua,null,314,48,65,9.0,0.5,8,
                                    listOf("wartortle","blastoise"),"\tEl caparazón de Squirtle no le sirve de protección únicamente. Su forma " +
                                    "redondeada y las hendiduras que tiene le ayudan a deslizarse en el agua y le permiten nadar a gran velocidad.","media")

        //----------------------------------------------------FIN CREACIÓN DE POKEMONES--------------------------------------------------------//

    //Creando pokedex
    var pokedexSonia = Pokedex(4,arrayListOf(charmander,squirtle))
    var pokedexAsh = Pokedex(6, arrayListOf())

    //creamos un entrenador pokemon
    var ash: EntrenadorPokemon = EntrenadorPokemon(24,"Ash","Ketchup")
    var sonia:EntrenadorPokemon = EntrenadorPokemon(15,"Sonia","Daysutke", pokedexSonia,arrayListOf(charmander,squirtle))

    //usando metodos toString de cada pokemon
    println(squirtle)
    println(pikachu)
    println(charmander)
    println(bulbasaur)

    //pausar por 5 segundos la ejecucion
    pausarEjecucion()

    //El entrenador Ash atrapó a Pikachu
    ash.aPokemones.add(pikachu)
    //Ash entrena a pikachu
    ash.entrenarPokemon("pikachu")

    //sonia encuentra a ash con pikachu y consulta su pokedex
    println("Sonia encuentra a ash con pikachu y consulta su pokedex")
    sonia.pokedex?.registrarPokemon(pikachu)

    //pausar por 5 segundos la ejecucion
    pausarEjecucion()

    //ash encuentra a Sonia con Charmander y consulta su pokedex
    println("Ash encuentra a Sonia con Charmander y consulta su pokedex")
    ash.pokedex?.registrarPokemon(charmander)

    //pausar por 5 segundos la ejecucion
    pausarEjecucion()

    //ash encuentra un bulbasaur y consulta su pokedex
    println("Ash encuentra un bulbasaur y consulta su pokedex")
    ash.pokedex?.registrarPokemon(bulbasaur)

    //pausar por 5 segundos la ejecucion
    pausarEjecucion()

    //ash encuentra un squirtle y consulta su pokedex
    println("Ash encuentra un squirtle y consulta su pokedex")
    ash.pokedex?.registrarPokemon(squirtle)

    //pausar por 5 segundos la ejecucion
    pausarEjecucion()

    //Estableciendo campo de batalla
    var campoDeBatalla :CampoDeBatalla = CampoDeBatalla(45,"Liga naranja","Meseta Añil",
        arrayListOf(ash.elegirPokemon("pikachu")!!,sonia.elegirPokemon("squirtle")!!))
    //comenzando batalla
    campoDeBatalla.comenzarBatalla()




}

fun pausarEjecucion(){
    try {
        // sleep for one second
        Thread.sleep(5000)
    } catch (e: InterruptedException) {
        println(e)
    }
}