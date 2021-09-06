package com.charlie.arrow.core.map.flatMap

import arrow.core.Either
import arrow.core.flatMap
import com.charlie.arrow.core.util.eq

fun main() {
    val right: Either<String, Int> = Either.Right(5)
    right.flatMap { Either.Right(it + 1) } eq Either.Right(6)
    right.map { it + 1 } eq Either.Right(6)

    val left: Either<String, Int> = Either.Left("Something went wrong")
    left.flatMap { Either.Right(it + 1) } eq Either.Left("Something went wrong")
    left.map { it + 1 } eq Either.Left("Something went wrong")
}
