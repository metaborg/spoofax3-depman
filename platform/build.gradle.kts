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

        // Metaborg Resource
        api(libs.metaborg.resource.api)
        api(libs.metaborg.resource.dagger)

        // Metaborg Common
        api(libs.metaborg.common)

        // Metaborg Log
        api(libs.metaborg.log.api)
        api(libs.metaborg.log.backend.slf4j)
        api(libs.metaborg.log.backend.logback)
        api(libs.metaborg.log.dagger)

        // Metaborg PIE
        api(libs.metaborg.pie.api)
        api(libs.metaborg.pie.api.test)
        api(libs.metaborg.pie.dagger)
        api(libs.metaborg.pie.graph)
        api(libs.metaborg.pie.runtime)
        api(libs.metaborg.pie.runtime.test)
        api(libs.metaborg.pie.serde.fst)
        api(libs.metaborg.pie.serde.kryo)
        api(libs.metaborg.pie.share.coroutine)
        api(libs.metaborg.pie.store.lmdb)
        api(libs.metaborg.pie.task.archive)
        api(libs.metaborg.pie.task.java)
        api(libs.metaborg.pie.task.java.ecj)
        api(libs.metaborg.pie.taskdefs.guice)
        api(libs.metaborg.pie.lang)
        api(libs.metaborg.pie.lang.runtime.java)
        api(libs.metaborg.pie.lang.runtime.kotlin)
        api(libs.metaborg.pie.lang.test)

        // Spoofax 3
        api(libs.spoofax3.lwb.compiler)
        api(libs.spoofax3.lwb.compiler.dagger)
        api(libs.spoofax3.lwb.compiler.gradle)
        api(libs.spoofax3.lwb.dynamicloading)

        // Spoofax 2
        api(libs.spoofax2.metaborg.util)
        api(libs.spoofax2.util.vfs2)
        api(libs.spoofax2.terms)
        api(libs.spoofax2.interpreter.core)
        api(libs.spoofax2.core)
        api(libs.spoofax2.meta.core)
        api(libs.spoofax2.spt.core)
        api(libs.spoofax2.meta.lib.spoofax)
        api(libs.spoofax2.meta.lib.analysis)
        api(libs.spoofax2.strategoxt.strj)
        api(libs.spoofax2.jsglr.shared)
        api(libs.spoofax2.jsglr2)
        api(libs.spoofax2.nabl2.terms)
        api(libs.spoofax2.nabl2.solver)
        api(libs.spoofax2.statix.solver)
        api(libs.spoofax2.sdf2table)
        api(libs.spoofax2.sdf2parenthesize)
        api(libs.spoofax2.makepermissive)
        api(libs.spoofax2.parsetable)
        api(libs.spoofax2.renaming.java)
        api(libs.spoofax2.interpreter.library.index)
        api(libs.spoofax2.flowspec.runtime)
        api(libs.spoofax2.runtime.task)
        api(libs.spoofax2.stratego.build)
        api(libs.spoofax2.stratego.build.spoofax2)
        api(libs.spoofax2.strategoxt)

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
