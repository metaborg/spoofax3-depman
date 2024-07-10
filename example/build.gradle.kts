plugins {
    `java-library`
}

group = "org.metaborg.example"

repositories {
    maven("https://artifacts.metaborg.org/content/groups/public/")
}

dependencies {
    implementation(platform(libs.metaborg.platform))

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
    // TODO: spoofax-language component
    //api(libs.spoofax3.pie.lang)
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

    // Kotlin
    api(libs.kotlinx.coroutines.core)

    // Collections
    api(libs.capsule)

    // Dependency Injection
    api(libs.guice)
    api(libs.dagger)
    api(libs.dagger.compiler)

    // Annotations & Annotation Processing
    api(libs.immutables.serial)
    api(libs.immutables.value)
    api(libs.immutables.value.annotations)
    api(libs.derive4j)
    api(libs.derive4j.annotation)
    api(libs.jakarta.annotation)
    api(libs.jakarta.inject)
    api(libs.javax.inject)
    api(libs.checkerframework.android)

    // Maven
    api(libs.maven.resolver.api)
    api(libs.maven.resolver.impl)
    api(libs.maven.resolver.connector.basic)
    api(libs.maven.resolver.transport.file)
    api(libs.maven.resolver.provider)
    api(libs.bnd.gradle)

    // Gradle
    api(libs.gradle.develocityPlugin)
    api(libs.gradle.foojayPlugin)

    // ECJ
    api(libs.eclipse.jdt.core)
    api(libs.eclipse.jdt.compiler.tool)
    api(libs.eclipse.jdt.compiler.apt)

    // Logging
    api(libs.slf4j.simple)
    api(libs.slf4j.api)
    api(libs.jcl.over.slf4j)
    api(libs.logback.core)
    api(libs.logback)

    // Data Formats
    api(libs.commons.configuration2.jackson)
    api(libs.jackson.core)
    api(libs.jackson.databind)
    api(libs.jackson.annotations)
    api(libs.jackson.dataformat.yaml)

    // Utils
    api(libs.commons.math3)
    api(libs.commons.io)
    api(libs.commons.compress)
    api(libs.commons.vfs2)
    api(libs.commons.lang3)
    api(libs.commons.configuration2)
    api(libs.guava)
    api(libs.failureaccess)
    api(libs.rxjava)
    api(libs.jimfs)
    api(libs.fst)
    api(libs.kryo)
    api(libs.lmdbjava)

    // Testing
    api(libs.junit)
    api(libs.junit.api)
    api(libs.junit.params)
    api(libs.junit.vintage)
    api(libs.junit4)
    api(libs.kotest)
    api(libs.kotest.assertions)
    api(libs.kotest.datatest)
    api(libs.kotest.property)
    api(libs.equalsverifier)
    api(libs.mockito.kotlin)

}

// Do not try to publish this project
tasks.withType<AbstractPublishToMaven>().configureEach { enabled = false }
tasks.named("checkNotDirty") { enabled = false }
tasks.named("assertNotDirty") { enabled = false }
tasks.named("checkSnapshotDependencies") { enabled = false }
