package com.fundamentos

// data class Pessoa(var name: String, var idade: Int) {
class Pessoa(var name: String, var idade: Int) {

    override fun toString(): String {
        return "Classe: Pessoa. Nome:  $name, idade: $idade"
    }

}

// criando uma pessoa com construtor
fun main() {
    // variavel do tipo pessoa
    var larissa = Pessoa("Larissa", 31)
    println(larissa)
}