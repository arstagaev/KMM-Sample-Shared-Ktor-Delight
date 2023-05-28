import com.arstagaev.testkmm9.Dependency
import com.arstagaev.testkmm9.Configuration

plugins {
    //kotlin("multiplatform")
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.arstagaev.testkmm9.android"
    compileSdk = Configuration.compileSdk
    defaultConfig {
        applicationId = "com.arstagaev.testkmm9.android"
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Configuration.kotlinCompilerExtVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Dependency.Compose.composeUi)
    implementation(Dependency.Compose.composeUiTooling)
    implementation(Dependency.Compose.composeUiToolingPreview)
    implementation(Dependency.Compose.composeFoundation)
    implementation(Dependency.Compose.composeMaterial)
    implementation(Dependency.Compose.composeActivity)

    implementation(Dependency.Coroutines.coroutineAndroid)

    implementation(Dependency.Koin.core)
    implementation(Dependency.Koin.android)

    implementation(Dependency.Compose.coilCompose)

//    implementation("androidx.compose.ui:ui:1.4.0")
//    implementation("androidx.compose.ui:ui-tooling:1.4.0")
//    implementation("androidx.compose.ui:ui-tooling-preview:1.4.0")
//    implementation("androidx.compose.foundation:foundation:1.4.0")
//    implementation("androidx.compose.material:material:1.4.0")
//    implementation("androidx.activity:activity-compose:1.7.0")
}