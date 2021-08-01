package com.charlie.arrow.core.leftIfNull

import arrow.core.Either
import arrow.core.Either.Left
import arrow.core.Either.Right
import arrow.core.rightIfNotNull
import com.charlie.arrow.core.util.eq

fun main() {
    "value".rightIfNotNull { "left" } eq Right("value")
    null.rightIfNotNull { "left" } eq Left("left")
}
