plugins {
  id("org.jetbrains.kotlin.multiplatform").version("2.0.0-RC1")
}

kotlin {
  js(IR) {
    browser {
      binaries.executable()
    }
  }
  
  sourceSets {
    getByName("commonMain") {
      dependencies {
        implementation("com.apollographql.apollo3:apollo-runtime:4.0.0-beta.5")
      }
    }
    getByName("commonTest") {
      dependencies {
        implementation(kotlin("test"))
      }
    }
  }
}