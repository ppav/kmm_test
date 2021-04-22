import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  kotlin("multiplatform")
  kotlin("native.cocoapods")
}

version = "1.0"

kotlin {
  val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
    if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
      ::iosArm64
    else
      ::iosX64

  iosTarget("ios") {}
  jvm()

  cocoapods {
    summary = "Some description for the Shared Module"
    homepage = "Link to the Shared Module homepage"
    ios.deploymentTarget = "14.1"
    frameworkName = "shared"
    podfile = project.file("../sample-ios/Podfile")
  }

  sourceSets {
    val commonMain by getting
  }
}
