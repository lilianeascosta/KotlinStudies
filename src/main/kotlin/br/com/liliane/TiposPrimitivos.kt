package br.com.liliane

import java.math.BigDecimal

fun main() {
    val byte: Byte = 121 // min: -128, max: 127
    val short: Short = 11111 // min: -32768, max: 32767
    val int: Int = 1111111111
    val long: Long = 1111111111111111111

    val float: Float = 1.38423f
    val double: Double = 1.38423
    val bigDecimal: BigDecimal = BigDecimal.ZERO
    val bigDecimal2: BigDecimal = BigDecimal("1.38423")

    val  boolean: Boolean = false
    val  boolean2: Boolean = true

    val char: Char = 'C' // só pega 1 caractere
    val string: String = "Anything" // aceita uma cadeia de caracteres

    val array: Array<Int> = arrayOf(0,2,4,6,8,10)

    // OBS.: kotlin é uma linguagem com variáveis estaticamente tipada
    // OBS.: não é obrigatório colocar o tipo da variável pois o Kotlin já reconhece
}