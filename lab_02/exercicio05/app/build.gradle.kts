plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "engtelecom.poo.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.run.configure {
    standardInput = System.`in`
}