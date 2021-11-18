@file:Suppress("UnstableApiUsage")

import com.android.build.api.dsl.ApplicationExtension

plugins {
  id("com.android.application")
  id("com.example.build.android-common")
}

extensions.configure<ApplicationExtension> {
  buildFeatures { compose = true }

  buildTypes { debug { applicationIdSuffix = ".debug" } }
  packagingOptions { resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" } }
}
