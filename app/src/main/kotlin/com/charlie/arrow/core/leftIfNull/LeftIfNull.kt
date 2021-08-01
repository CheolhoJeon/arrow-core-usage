package com.charlie.arrow.core.leftIfNull

import arrow.core.Either
import arrow.core.Either.Left
import arrow.core.Either.Right
import arrow.core.left
import arrow.core.leftIfNull
import arrow.core.right
import com.charlie.arrow.core.util.eq

fun main() {
    Right(12).leftIfNull { -1 } eq 12.right()
    Right(null).leftIfNull { -1 } eq (-1).left()
    Left(12).leftIfNull { -1 } eq 12.left()
}
