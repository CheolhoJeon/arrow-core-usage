package com.charlie.arrow.core.getOrHandle

import arrow.core.Either
import arrow.core.getOrHandle
import com.charlie.arrow.core.util.eq
import java.lang.NumberFormatException

fun main() {
    val l: Either<Throwable, Int> = Either.Left(NumberFormatException())
    l.getOrHandle {
        when(it) {
            is NumberFormatException -> 400
            else -> 500
        }
    } eq 400

    val r: Either<Throwable, Int> = Either.Right(200)
    r.getOrHandle {
        when(it) {
            is NumberFormatException -> 400
            else -> 500
        }
    } eq 200
}
