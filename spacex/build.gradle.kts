import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  kotlin("multiplatform")
}


kotlin {
  jvm()
  sourceSets {
    val commonMain by getting
    val jvmMain by getting {
      dependsOn(commonMain) // May not be necessary.
      dependencies {
        api(project(":shared"))
        api(project(":dragon"))
      }
    }
  }
}
