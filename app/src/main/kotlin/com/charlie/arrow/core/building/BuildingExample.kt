package com.charlie.arrow.core.building

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.charlie.arrow.core.util.eq

fun main() {
    7.right() eq Either.Right(7)
    "hello".left() eq Either.Left("hello")
}
