package com.charlie.arrow.core.catch

import arrow.core.Either
import java.lang.RuntimeException

sealed class Error {
    object SpecificError : Error()
}

fun potentialThrowingCode(): String = throw RuntimeException("Blow up!")

suspend fun makeSureYourLogicDoesNotHaveSideEffects(): Either<Error, String> =
    Either.catch { potentialThrowingCode() }.mapLeft { Error.SpecificError }

suspend fun main() {
    println("makeSureYourLogicDoesNotHaveSideEffects().isLeft() = ${makeSureYourLogicDoesNotHaveSideEffects().isLeft()}")
}
