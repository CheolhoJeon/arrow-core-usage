package com.charlie.arrow.core.map

import arrow.core.Either
import com.charlie.arrow.core.util.eq

fun main() {
    val r: Either<Int, Int> = Either.Right(7)
    val rightMapLeft = r.mapLeft { it + 1 }
    val l: Either<Int, Int> =  Either.Left(7)
    val leftMapLeft = l.mapLeft { it + 1 }

    rightMapLeft eq Either.Right(7)
    leftMapLeft eq Either.Left(8)
}
