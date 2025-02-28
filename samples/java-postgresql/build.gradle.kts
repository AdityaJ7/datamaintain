plugins {
    id("org.jetbrains.kotlin.jvm")
}

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":modules:core"))
    implementation(project(":modules:driver-jdbc"))
    implementation("org.postgresql:postgresql:42.7.1")
}
