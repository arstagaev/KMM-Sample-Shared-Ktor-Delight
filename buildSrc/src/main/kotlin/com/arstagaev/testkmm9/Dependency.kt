package com.arstagaev.testkmm9

object Dependency {
    object Org {
        object JetBrains {
            object Kotlinx {
                const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

                const val kotlinxSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
            }

            object KotlinWrappers {
                const val kotlinWrappersBom = "org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:${Versions.kotlinWrappersBom}"
                const val kotlinStyled = "org.jetbrains.kotlin-wrappers:kotlin-styled"
            }
        }
    }

    object Coroutines{
        const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val okhttp = "io.ktor:ktor-client-okhttp:${Versions.ktor}"

        const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val json = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"

        const val android = "io.ktor:ktor-client-android:${Versions.ktor}"

        const val darwin = "io.ktor:ktor-client-darwin:${Versions.ktor}"
    }

    object Logback {
        const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logbackClassic}"
    }

    object SQLDelight {
        const val gradlePlugin = "app.cash.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        const val androidDriver = "app.cash.sqldelight:android-driver:${Versions.sqlDelight}"
        const val sqliteDriver = "app.cash.sqldelight:sqlite-driver:${Versions.sqlDelight}"
        const val nativeDriver = "app.cash.sqldelight:native-driver:${Versions.sqlDelight}"
        const val sqljsDriver = "app.cash.sqldelight:sqljs-driver:${Versions.sqlDelight}"

        const val coroutinesExtensions = "app.cash.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        const val primitiveAdapters = "app.cash.sqldelight:primitive-adapters:${Versions.sqlDelight}"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val composeAndroidX = "io.insert-koin:koin-androidx-compose:${Versions.koinComposeAndroidx}"
        const val compose = "io.insert-koin:koin-compose:${Versions.koinCompose}"
        const val composeNavigation = "io.insert-koin:koin-androidx-compose-navigation:${Versions.koinComposeAndroidx}"
    }

    object Compose {
        const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.composeMaterial}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val composeFoundation =
            "androidx.compose.foundation:foundation:${Versions.composeFoundation}"
        const val composeUiToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Github {
        const val imageLoader = "io.github.qdsfdhvh:image-loader:${Versions.imageLoader}"
    }
}