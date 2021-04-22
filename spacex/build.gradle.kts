plugins {
  kotlin("jvm")
}


kotlin {
  dependencies {
    api(project(":shared"))
    api(project(":dragon"))
  }
}
