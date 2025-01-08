package com.fundamentos

class Carro(val cor: String, var anoFabricao: Int, val dono: Dono) {
    // val não altera o valor porém fica acessivel
    // var é uma variavel mutavel
}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Larissa", 31));
    print(carro.cor + " \r\n")
    // carro.cor = "Preto"; - erro, não se altera.

    carro.anoFabricao = 2025;
    print(carro.anoFabricao)
    print(" \r\n")

    print(carro.dono)
    print(" \r\n")
    print(carro.dono.nome + " \r\n")
    print(carro.dono.idade)
    print(" \r\n")

    // acessa e altera variaveis.
    carro.dono.nome = "Larissa Duarte"
    print(carro.dono.nome)
}