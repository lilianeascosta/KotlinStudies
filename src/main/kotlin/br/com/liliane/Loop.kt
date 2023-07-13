package br.com.liliane

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"), BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    // for
    var precoTotal = BigDecimal.ZERO
    for (preco in precoDosProdutos) {
        precoTotal += preco
    }
    println("Preço Total: ${precoTotal}")

    // while
    var count = 0
    precoTotal = BigDecimal.ZERO
    while(count < precoDosProdutos.size) {
        precoTotal += precoDosProdutos[count]
        count += 1
    }
    println("Preço Total: ${precoTotal}")

    // do while
    count = 0
    precoTotal = BigDecimal.ZERO
    do {
        precoTotal += precoDosProdutos[count]
        count ++
    } while (count < precoDosProdutos.size)
    println("Preço Total: ${precoTotal}")
}