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

        // Spoofax 3/PIE
        api(libs.spoofax3.spoofax.common)
        api(libs.spoofax3.aterm.common)
        api(libs.spoofax3.jsglr.common)
        api(libs.spoofax3.jsglr.pie)
        api(libs.spoofax3.jsglr1.common)
        api(libs.spoofax3.jsglr2.common)
        api(libs.spoofax3.esv.common)
        api(libs.spoofax3.stratego.common)
        api(libs.spoofax3.stratego.pie)
        api(libs.spoofax3.constraint.common)
        api(libs.spoofax3.constraint.pie)
        api(libs.spoofax3.nabl2.common)
        api(libs.spoofax3.statix.codecompletion)
        api(libs.spoofax3.statix.codecompletion.pie)
        api(libs.spoofax3.statix.common)
        api(libs.spoofax3.statix.pie)
        api(libs.spoofax3.statix.multilang)
        api(libs.spoofax3.statix.multilang.eclipse)
        api(libs.spoofax3.spt.api)
        api(libs.spoofax3.tego.runtime)
        api(libs.spoofax3.spoofax2.common)
        api(libs.spoofax3.tooling.eclipsebundle)
        api(libs.spoofax3.transform.pie)
        api(libs.spoofax3.spoofax.core)
        api(libs.spoofax3.spoofax.resource)
        api(libs.spoofax3.spoofax.test)
        api(libs.spoofax3.spoofax.cli)
        api(libs.spoofax3.spoofax.intellij)
        api(libs.spoofax3.spoofax.eclipse)
        api(libs.spoofax3.spoofax.compiler)
        api(libs.spoofax3.spoofax.compiler.spoofax2)
        api(libs.spoofax3.spoofax.compiler.spoofax2.dagger)
        api(libs.spoofax3.spoofax.compiler.interfaces)
        api(libs.spoofax3.spoofax.compiler.gradle)
        api(libs.spoofax3.spoofax.compiler.gradle.spoofax2)
        api(libs.spoofax3.spoofax.compiler.eclipsebundle)
        api(libs.spoofax3.spoofax.lwb.compiler)
        api(libs.spoofax3.spoofax.lwb.compiler.gradle)
        api(libs.spoofax3.spoofax.lwb.dynamicloading)
        api(libs.spoofax3.cfg)
//        api(libs.spoofax3.cfg.cli)
//        api(libs.spoofax3.cfg.eclipse)
//        api(libs.spoofax3.cfg.intellij)
        api(libs.spoofax3.cfg.spoofax2)
        api(libs.spoofax3.dynamix)
//        api(libs.spoofax3.dynamix.cli)
//        api(libs.spoofax3.dynamix.eclipse)
//        api(libs.spoofax3.dynamix.intellij)
        api(libs.spoofax3.dynamix.spoofax2)
        api(libs.spoofax3.sdf3extdynamix)
//        api(libs.spoofax3.sdf3extdynamix.eclipse)
        api(libs.spoofax3.sdf3extdynamix.spoofax2)
        api(libs.spoofax3.sdf3)
//        api(libs.spoofax3.sdf3.cli)
//        api(libs.spoofax3.sdf3.eclipse)
//        api(libs.spoofax3.sdf3.intellij)
        api(libs.spoofax3.stratego)
//        api(libs.spoofax3.stratego.cli)
//        api(libs.spoofax3.stratego.eclipse)
//        api(libs.spoofax3.stratego.intellij)
        api(libs.spoofax3.esv)
//        api(libs.spoofax3.esv.cli)
//        api(libs.spoofax3.esv.eclipse)
//        api(libs.spoofax3.esv.intellij)
        api(libs.spoofax3.statix)
//        api(libs.spoofax3.statix.cli)
//        api(libs.spoofax3.statix.eclipse)
//        api(libs.spoofax3.statix.intellij)
        api(libs.spoofax3.sdf3extstatix)
//        api(libs.spoofax3.sdf3extstatix.eclipse)
        api(libs.spoofax3.spt)
        api(libs.spoofax3.spt.dynamicloading)
//        api(libs.spoofax3.spt.cli)
//        api(libs.spoofax3.spt.eclipse)
//        api(libs.spoofax3.spt.intellij)
        api(libs.spoofax3.libspoofax2)
//        api(libs.spoofax3.libspoofax2.eclipse)
        api(libs.spoofax3.libstatix)
//        api(libs.spoofax3.libstatix.eclipse)
        api(libs.spoofax3.strategolib)
        api(libs.spoofax3.strategolib.eclipse)
        api(libs.spoofax3.gpp)
        api(libs.spoofax3.gpp.eclipse)

        // Stratego XT
        api(libs.strategoxt.strj)
        api(libs.spoofax2.strategoxt)

        // Spoofax 2
        api(libs.spoofax2.metaborg.util)
        api(libs.spoofax2.util.vfs2)
        api(libs.spoofax2.terms)
        api(libs.spoofax2.interpreter.core)
        api(libs.spoofax2.interpreter.library.xml)
        api(libs.spoofax2.interpreter.library.java)
        api(libs.spoofax2.interpreter.library.index)
        api(libs.spoofax2.interpreter.library.jsglr)
        api(libs.spoofax2.core)
        api(libs.spoofax2.meta.core)
        api(libs.spoofax2.spt.core)
        api(libs.spoofax2.meta.lib.spoofax)
        api(libs.spoofax2.meta.lib.analysis)
        api(libs.spoofax2.jsglr.shared)
        api(libs.spoofax2.jsglr)
        api(libs.spoofax2.jsglr2)
        api(libs.spoofax2.nabl2.terms)
        api(libs.spoofax2.nabl2.solver)
        api(libs.spoofax2.statix.solver)
        api(libs.spoofax2.sdf2table)
        api(libs.spoofax2.sdf2parenthesize)
        api(libs.spoofax2.makepermissive)
        api(libs.spoofax2.parsetable)
        api(libs.spoofax2.renaming.java)
        api(libs.spoofax2.flowspec.runtime)
        api(libs.spoofax2.runtime.task)
        api(libs.spoofax2.stratego.build)
        api(libs.spoofax2.stratego.build.spoofax2)

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
