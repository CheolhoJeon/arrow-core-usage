package com.charlie.arrow.core.get

import arrow.core.getOrElse
import arrow.core.getOrHandle
import arrow.core.left
import arrow.core.right
import com.charlie.arrow.core.util.eq

fun main() {
    "hello".right().getOrElse { 7 } eq "hello"

    "hello".left().getOrElse { 7 } eq 7
    "hello".left().getOrHandle { "$it world!" } eq "hello world!"
}
