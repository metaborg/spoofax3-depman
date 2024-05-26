# Spoofax 3 Platform
This is the Spoofax 3 platform, which specifies the versions of Spoofax dependencies that are known to work together, for users of Spoofax 3. To depend on this platform, specify in your `build.gradle.kts`:

```kotlin
dependencies {
    implementation(platform("org.metaborg.spoofax3:platform"))
}
```
