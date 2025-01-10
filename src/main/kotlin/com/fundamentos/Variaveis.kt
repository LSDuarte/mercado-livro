package com.fundamentos

fun main() {
    var nome = "Larissa"   // mutavel
    val nomeVal = "Lucas" // não mutavel

    nome = "Larissa Duarte"
    //nomeVal = "Larissa Duarte"

    println(nomeVal)
    println(nome)

    // variaveis fora de classe não precisam ser inicializadas
}

class Variaveis {
    // variaveis em classes precisam ser inicializadas
    var nome: String? = null

    // lateinit é uma palavra reservada que deixa atribuir ou inicializar posteriormente
    lateinit var teste: String

    fun iniciaVariavel() {
        teste = "Teste"
    }
}