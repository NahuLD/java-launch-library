# java-launch-library

[![Download](https://api.bintray.com/packages/nahuld/projects/java-launch-library/images/download.svg) ](https://bintray.com/nahuld/projects/java-launch-library/_latestVersion)

A simple wrapper written in Java for the [Launch Library API](https://launchlibrary.net/). Written and maintained by [Nahuel](https://github.com/NahuLD).

### Requirements
- Java 8 or above.

### Download
> Replace `VERSION` with a specific version. The latest version can be found at
> the "Download" button, or the Bintray page.

##### Maven
```xml
<repositories>
  <repository>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
    <id>central</id>
    <name>bintray</name>
    <url>https://jcenter.bintray.com</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>me.nahu</groupId>
    <artifactId>launchlibrary</artifactId>
    <version>VERSION</version>
    <type>pom</type>
  </dependency>
</dependencies>
```
##### Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'me.nahu:launchlibrary:VERSION'
}
```

### Usage

To get started, you'll need to get a LaunchLibrary instance.
```java
        LaunchLibrary launchLibrary = new LaunchLibrary.Builder().build();
```
Next, we can use the functions in this instance to query the API and get what we need. For this next example we'll query all Falcon rockets and print their names.
```java
        LaunchLibrary launchLibrary = new LaunchLibrary.Builder().build();
        launchLibrary.getRocketsFromName("Falcon").execute(rocketQuery -> 
                rocketQuery.getRockets().forEach(rocket -> 
                        System.out.println(rocket.getName())
                )
        );
```

### How to build

##### With dependencies
1. Run `./gradlew shadowJar` in project's root.
2. The file located in `build/libs`.
##### Without dependencies
1. Run `./gradlew build` in project's root.
2. The file located in `build/libs`.

### Contributing
Pull requests are accepted and greatly appreciated. Please be sure to follow the code guidelines stated bellow.

### Code Guidelines
- [Google's Java style guide.](https://google.github.io/styleguide/javaguide.html)

### License
The contents of this repository are licensed under the MIT license. A
copy of the MIT license can be found in [LICENSE](https://github.com/NahuLD/java-launch-library/blob/master/LICENSE).
