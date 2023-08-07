plugins {
    java
    `maven-publish`
    `java-library`
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "me.nahu.launchlibrary"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = sourceCompatibility
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-scalars:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")
    api("com.google.code.gson:gson:2.8.9")
}

publishing {
    publications {
        create<MavenPublication> ("mavenJava") {
            from(components["java"])
        }
    }

    repositories {
        mavenCentral()
    }
}