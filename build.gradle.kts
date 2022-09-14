buildscript {
    repositories {
        google()
        maven("https://plugins.gradle.org/m2/")
        maven { url = uri("https://developer.huawei.com/repo/") }
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.0")
        classpath("com.google.gms:google-services:4.3.13")
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.1")
    }
}

allprojects {
    buildscript {
        repositories {
            google()
            mavenCentral()
        }
    }

    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://developer.huawei.com/repo/") }
    }
}