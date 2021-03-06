package dependencies.main

import Versions


object PersistentDependencies {
    const val jooq = "org.jooq:jooq:${Versions.jooq}"
    const val postgresql = "org.postgresql:postgresql:${Versions.postgresql}"
}

val implementation: Configuration by configurations
dependencies {
    implementation(PersistentDependencies.jooq)
    implementation(PersistentDependencies.postgresql)
}
