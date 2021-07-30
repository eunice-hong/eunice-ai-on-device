plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation  ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor( "com.github.bumptech.glide:compiler:4.11.0")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "kr.eunicehong.euniceaiondevice.android"
        minSdkVersion(26)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        dataBinding = true
    }
}