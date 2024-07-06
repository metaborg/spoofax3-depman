---
title: "Adding Dependencies"
---
# Adding Dependencies
To add a dependency:

1.  Modify the `gradle/libs.versions.toml` file and add the dependency to the correct section (or create a new section).\
    Consult the [Gradle documentation](https://docs.gradle.org/current/userguide/platforms.html#sub::toml-dependencies-format) for more information on the `libs.versions.toml` file format.
2.  Also mention the dependency in `example/build.gradle.kts`.
3.  If the dependency is a Spoofax dependency (a library, application, or language that is part of Spoofax), also add the dependency to `platform/build.gradle.kts`.

