plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'androidx.navigation.safeargs.kotlin'
    id 'dagger.hilt.android.plugin'
    id 'kotlin-parcelize'
    id 'kotlin-kapt'

}

android {
    compileSdk 31

    defaultConfig {
        applicationId "com.example.todo"
        minSdk 24
        targetSdk 31
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }

    buildFeatures {
        dataBinding true
        viewBinding true
    }
}

dependencies {
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    def nav_version = "2.3.5"
    def room_version = "2.4.0-rc01"
    def lifecycle_version = "2.4.0"

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    //Navigation component
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
    implementation "androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

    //Room
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
    implementation "androidx.room:room-ktx:$room_version"

    // Lifecycle
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    //Kotlin coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'

    //Hilt DI
    implementation 'com.google.dagger:hilt-android:2.40.1'
    kapt 'com.google.dagger:hilt-compiler:2.40.1'


}