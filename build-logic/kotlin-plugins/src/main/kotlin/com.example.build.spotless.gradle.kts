import com.diffplug.gradle.spotless.SpotlessExtension

plugins {
    id("com.diffplug.spotless")
}

extensions.configure<SpotlessExtension> {
    kotlin {
        ktfmt().googleStyle()
        target("**/*.kt")
        targetExclude("**/build/")
    }
    kotlinGradle {
        ktfmt().googleStyle()
        target("**/*.kts")
        targetExclude("**/build/")
    }
}