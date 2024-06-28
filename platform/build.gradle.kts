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
        api(libs.spoofax3.log.api)
        api(libs.spoofax3.log.backend.slf4j)
        api(libs.spoofax3.pie.api)
        api(libs.spoofax3.pie.runtime)
        api(libs.spoofax3.pie.dagger)

        // Spoofax 2
        api(libs.spoofax2.metaborg.util)
        api(libs.spoofax2.terms)
        api(libs.spoofax2.interpreter.core)
        api(libs.spoofax2.core)
        api(libs.spoofax2.meta.core)
        api(libs.spoofax2.spt.core)
        api(libs.spoofax2.meta.lib.spoofax)
        api(libs.spoofax2.meta.lib.analysis)
        api(libs.spoofax2.strategoxt.strj)
        api(libs.spoofax2.jsglr.shared)

        // Spoofax languages
        api(libs.spoofax.lang.esv)
        api(libs.spoofax.lang.sdf3)
        api(libs.spoofax.lang.spt)
        api(libs.spoofax.lang.nabl)
        api(libs.spoofax.meta.nabl2.shared)
        api(libs.spoofax.meta.nabl2.runtime)
        api(libs.spoofax.lang.ts)
        api(libs.spoofax.lang.statix)
        api(libs.spoofax.meta.sdf3.ext.statix)
        api(libs.spoofax.meta.statix.runtime)
        api(libs.spoofax.lang.stratego2)
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
