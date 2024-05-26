# Spoofax 3 Catalog
This is the Spoofax 3 catalog, which specifies the versions of dependencies within Spoofax 3. To use this catalog, specify in your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from("org.metaborg.spoofax3:catalog")
        }
    }
}
```
