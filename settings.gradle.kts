pluginManagement {
    val kotlinVersion: String by settings
    val ktLintPluginVersion: String by settings

    plugins {
        id("org.jlleitschuh.gradle.ktlint") version ktLintPluginVersion
    }
}

rootProject.name = "arrow-core-usage"
include("app")
