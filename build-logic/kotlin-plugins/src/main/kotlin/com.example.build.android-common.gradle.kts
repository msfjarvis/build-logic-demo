import com.android.build.gradle.TestedExtension
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { id("org.jetbrains.kotlin.android") }

extensions.configure<TestedExtension> {
  compileSdkVersion(31)
  defaultConfig {
    minSdk = 23
    targetSdk = 31
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  tasks.withType<KotlinCompile> { kotlinOptions { jvmTarget = JavaVersion.VERSION_11.toString() } }
}
