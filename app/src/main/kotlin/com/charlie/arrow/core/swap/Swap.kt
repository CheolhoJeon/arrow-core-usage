package com.charlie.arrow.core.swap

import arrow.core.Either
import com.charlie.arrow.core.util.eq

fun main() {
    val r: Either<String, Int> = Either.Right(7)
    val swapped = r.swap()

    swapped eq Either.Left(7)
}
