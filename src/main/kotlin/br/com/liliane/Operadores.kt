package br.com.liliane

fun main() {
    // Atribuição
    val inteiro = 1
    val helloWorld = "Hello World"

    // Operador com String: Concatenar (+)
    println("Hello" + "World")
    println("OUtra forma de concatenação é ${"usando essa notação"}")

    // Operadores numéricos
    println("33 + 47 = ${33 + 47}")
    println("33 - 47 = ${33 - 47}")
    println("33 * 47 = ${33 * 47}")
    println("10 / 3 = ${10 / 3}") // divide número inteiro retorna inteiro
    println("10.0 / 3.0 = ${10.0 / 3.0}") // divide número decimal retorna decimal
    println("10 % 3 = ${10 % 3}") // pega o resto

    // Operadores de comparação
    println("1 == 1 -> ${1 == 1}")
    println("3 == 1 -> ${3 == 1}")
    println("1 > 3 -> ${1 > 3}")
    println("5 < 1 -> ${5 < 1}")
    println("5 >= 1 -> ${5 >= 1}")
    println("5 <= 1 -> ${5 <= 1}")
    println("Fernando == Fernando -> ${"Fernando" == "Fernando"}")
    println("Fernando != Fernando -> ${"Fernando" != "Fernando"}")

    // OBS.: == não funciona com array, mas assim funciona:
    println(arrayOf(1,2,3).contentEquals(arrayOf(1,2,3)))
    // OBS.: o == não funcionou com o array pois o kotlin compara com a referência de memória
}