plugins {
    application

    id("org.openjfx.javafxplugin") version "0.1.0"
    kotlin("jvm") version "2.1.20"
}

kotlin {
    jvmToolchain(21)
}

group = "ca.uoguelph"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junitVersion = "5.10.2"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

//sourceSets {
//    main {
//        kotlin.srcDirs("main")
//    }
//}

application {
    mainClass.set("Launcher")
}

javafx {
    version = "21"
    modules = listOf(
        "javafx.controls",
        "javafx.base",
        "javafx.graphics",
        "javafx.media",
    )
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}