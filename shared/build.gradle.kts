import com.arstagaev.testkmm9.Dependency
import com.arstagaev.testkmm9.Configuration
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("app.cash.sqldelight")
}

kotlin {
//    android {
//        compilations.all {
//            kotlinOptions.jvmTarget = "11"
//        }
//        tasks.withType<KotlinCompile> {
//            kotlinOptions {
//                jvmTarget = "11"
//            }
//        }
//    }
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                //Koin
                implementation(Dependency.Koin.core)
                // Ktor
                with(Dependency.Ktor) {
                    api(core)
                    api(json)
                    api(contentNegotiation)
                    api(clientLogging)
                }

                // SqlDelight
                with(Dependency.SQLDelight) {
                    api(coroutinesExtensions)
                    api(primitiveAdapters)
                }

//                implementation(Ktor.ktorCoreClient)
//                implementation(Coroutines.coroutineCore)
//                implementation(Ktor.serialization)
//                implementation(Ktor.clientLogging)
//                implementation(Ktor.json)
//                implementation(Ktor.contentNegotiation)
            }
        }
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//            }
//        }
        val androidMain by getting {
            dependencies {
                implementation(Dependency.Koin.android)

                implementation(Dependency.Ktor.okhttp)
                implementation(Dependency.Ktor.android)

                // SqlDelight
                implementation(Dependency.SQLDelight.androidDriver)

            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)

            dependencies {
                // Ktor
                implementation(Dependency.Ktor.darwin)
                // SqlDelight
                implementation(Dependency.SQLDelight.nativeDriver)
            }
        }
    }
}

android {
    namespace = "com.arstagaev.testkmm9"
    compileSdk = Configuration.compileSdk
    defaultConfig {
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

sqldelight {
    databases {
        create("AppDatabase") {
            //sqldelight/com/arstagaev/testkmm9/cache/AppDatabase.sq
            packageName.set("com.arstagaev.testkmm9.cache")
        }
    }
}