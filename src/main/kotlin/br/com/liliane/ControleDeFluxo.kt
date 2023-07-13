package br.com.liliane

fun main() {
    val tipoDeRota = "A_PE" // A_PE, CARRO, OBIBUS, TREM

    if(tipoDeRota == "A_PE") {
        println("Traçando rota a pé")
    } else {
        if (tipoDeRota == "CARRO") {
            println("Traçando rota de carro")
        } else {
            if (tipoDeRota == "ONIBUS") {
                println("Traçando rota de onibus")
            } else {
                if (tipoDeRota == "TREM") {
                    println("Traçando rota de trem")
                } else {
                    println("Traçando rota com outro meio")
                }
            }
        }
    }
    // OBS.: estudo didático, obviamente isso é contra as regras do código limpo

    when(tipoDeRota) {
        "A_PE" -> println("Traçando rota a pé")
        "CARRO" -> println("Traçando rota de carro")
        "ONIBUS" -> println("Traçando rota de onibus")
        "TREM" -> println("Traçando rota de trem")
        else -> println("Traçando rota com outro meio")
    }
}