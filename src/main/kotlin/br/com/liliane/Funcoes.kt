package br.com.liliane

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"), BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    var precoTotal = somarPrecoProdutos(precoDosProdutos)

    println("Preço total: $precoTotal")
}

fun somarPrecoProdutos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO
    for(preco in produtos){
        precoTotal += preco
    }
    return precoTotal
}