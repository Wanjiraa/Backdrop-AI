

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.android.example.cameraxapp"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.android.example.cameraxapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
      

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding =true

    }
}


dependencies {


implementation(libs.firebase.inappmessaging)
    //dependencies with camerax_version info
    val camerax_version =( "1.2.2")
    //The following line is optional,
    implementation ("androidx.camera:camera-core:${camerax_version}")
    implementation ("androidx.camera:camera-camera2:${camerax_version}")
    //If you want to additionally use the CameraX Lifecycle library
    implementation ("androidx.camera:camera-lifecycle:${camerax_version}")
   // If you want to additionally use the CameraX VideoCapture library
    implementation ("androidx.camera:camera-video:${camerax_version}")
   // If you want to additionally use the CameraX View class
    implementation ("androidx.camera:camera-view:${camerax_version}")
    // If you want to additionally add CameraX ML Kit Vision Integration
    implementation("androidx.camera:camera-mlkit-vision:${camerax_version}")
    // If you want to additionally use the CameraX Extensions library
    implementation ("androidx.camera:camera-extensions:${camerax_version}")
    }
