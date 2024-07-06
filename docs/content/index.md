---
title: "Depman"
---
# Dependency Management
This project manages the Spoofax 3 dependencies in the various Spoofax 3 projects and users of Spoofax 3 projects.



## Platform
The Spoofax 3 platform specifies the versions of Spoofax dependencies that are known to work together. The `org.metaborg.spoofax3:platform` package is meant to be used by consumers of Spoofax 3 dependencies. To depend on this platform, specify in your `build.gradle.kts`:

```kotlin
repositories {
    maven("https://artifacts.metaborg.org/content/groups/public/")
}

dependencies {
    implementation(platform("org.metaborg.spoofax3:platform:<version>"))
}
```


## Catalog
The Spoofax 3 catalog specifies the versions of dependencies within the projects that constitute Spoofax 3 itself.
The `org.metaborg.spoofax3:catalog` package is meant to be used internally within Spoofax 3 projects. To use this catalog, specify in your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
    versionCatalogs {
        create("libs") {
            from("org.metaborg.spoofax3:catalog:<version>")
        }
    }
}
```
