import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    application
}

group = "me.pawar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val springVersion = "5.3.6"

    implementation(group="org.springframework", name="spring-core", version=springVersion)
    implementation(group="org.springframework", name="spring-context", version=springVersion)
    implementation(group="javax.inject", name="javax.inject", version="1")

    testImplementation(kotlin("test-junit"))
    testImplementation(group="org.springframework", name="spring-test", version=springVersion)
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}