plugins {
    `java-platform`
    `maven-publish`
    signing
}

group = "org.metaborg.spoofax3"
description = "A Spoofax 3 platform."

dependencies {
    constraints {
        // NOTE: Also update part of libs.versions.toml
        // Spoofax 3
        api(libs.spoofax3.resource)
        api(libs.spoofax3.common)
        api(libs.spoofax3.pie.runtime)

        // Spoofax 2
        api(libs.spoofax2.metaborg.util)
        api(libs.spoofax2.terms)
        api(libs.spoofax2.interpreter.core)
        api(libs.spoofax2.core)
        api(libs.spoofax2.meta.core)
        api(libs.spoofax2.spt.core)
        api(libs.spoofax2.meta.lib.spoofax)
        api(libs.spoofax2.meta.lib.analysis)

        // Spoofax languages
        api(libs.spoofax.lang.esv)
        api(libs.spoofax.lang.sdf3)
        api(libs.spoofax.lang.spt)
        api(libs.spoofax.lang.nabl)
        api(libs.spoofax.lang.ts)
        api(libs.spoofax.lang.statix)
        api(libs.spoofax.meta.statix.runtime)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenPlatform") {
            from(components["javaPlatform"])
            pom {
                name.set("Spoofax 3 Platform")
            }
        }
    }
}

// signing {
//     sign(publishing.publications["mavenPlatform"])
// }
