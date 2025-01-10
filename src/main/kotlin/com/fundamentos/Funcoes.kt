package com.fundamentos

//entendendo funções no Kotlin (podem ou não retornar valor)

fun main() {
    //println("Hello World");
    //println(retornaNome());

    //var nome = retornaNome();
    //print(nome)

    dizOi(retornaNome(), 31)
    dizOi(idade = 31, nome = retornaNome())
    dizOi("Laribel")
}

fun retornaNome(): String {
    //return "Hello World"
    return "Larissa"
}

fun dizOi(nome: String, idade: Int = 30) {
    println("Oi $nome, $idade anos")
}