import java.util.*

plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "5.2.0"
    id("com.jfrog.bintray") version "1.8.5"
}

group = "me.nahu"
version = "1.1.2"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = sourceCompatibility
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:20.1.0")

    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.google.guava:guava:23.5-jre")

    implementation("com.neovisionaries:nv-i18n:1.27")

    implementation("com.squareup.retrofit2:retrofit:2.6.2")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}

publishing.publications.create<MavenPublication> ("mavenJava") {
    from(components["java"])
}

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_API_KEY")
    setPublications("mavenJava")

    with(pkg) {
        repo = "projects"
        userOrg = user
        name = "java-launch-library"
        setLicenses("MIT")
        vcsUrl = "https://github.com/NahuLD/java-launch-library.git"

        with(version) {
            name = project.version.toString()
            desc = "Launch Library (launchlibrary.net) API wrapper for Java"
            released = Date().toString()
        }
    }

    override = true // just in case
    publish = true
}
