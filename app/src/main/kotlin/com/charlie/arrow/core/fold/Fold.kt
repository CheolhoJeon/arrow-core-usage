package com.charlie.arrow.core.fold

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.charlie.arrow.core.util.eq

fun main() {
    val r: Either<Int, Int> = 7.right()
    r.fold({ 1 }, { it + 3 }) eq 10

    val l: Either<Int, Int> = 7.left()
    l.fold({ 1 }, { it + 3 }) eq 1
}
