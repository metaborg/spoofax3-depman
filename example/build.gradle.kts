plugins {
    java
}

group = "org.metaborg.example"

repositories {
    maven("https://artifacts.metaborg.org/content/groups/public/")
}

dependencies {
    // Spoofax 3
    implementation(libs.spoofax3.resource)
    implementation(libs.spoofax3.common)
    implementation(libs.spoofax3.log.api)
    implementation(libs.spoofax3.log.backend.slf4j)
    implementation(libs.spoofax3.pie.api)
    implementation(libs.spoofax3.pie.runtime)
    implementation(libs.spoofax3.pie.dagger)

    // Spoofax 2
    implementation(libs.spoofax2.metaborg.util)
    implementation(libs.spoofax2.util.vfs2)
    implementation(libs.spoofax2.terms)
    implementation(libs.spoofax2.interpreter.core)
    implementation(libs.spoofax2.core)
    implementation(libs.spoofax2.meta.core)
    implementation(libs.spoofax2.spt.core)
    implementation(libs.spoofax2.meta.lib.spoofax)
    implementation(libs.spoofax2.meta.lib.analysis)
    implementation(libs.spoofax2.strategoxt.strj)
    implementation(libs.spoofax2.jsglr.shared)
    implementation(libs.spoofax2.jsglr2)
    implementation(libs.spoofax2.nabl2.terms)
    implementation(libs.spoofax2.nabl2.solver)
    implementation(libs.spoofax2.statix.solver)
    implementation(libs.spoofax2.sdf2table)
    implementation(libs.spoofax2.renaming.java)
    implementation(libs.spoofax2.interpreter.library.index)
    implementation(libs.spoofax2.flowspec.runtime)
    implementation(libs.spoofax2.runtime.task)

    // Spoofax languages
    implementation(libs.spoofax.lang.esv)
    implementation(libs.spoofax.lang.sdf3)
    implementation(libs.spoofax.lang.spt)
    implementation(libs.spoofax.lang.nabl)
    implementation(libs.spoofax.meta.nabl2.shared)
    implementation(libs.spoofax.meta.nabl2.runtime)
    implementation(libs.spoofax.lang.ts)
    implementation(libs.spoofax.lang.statix)
    implementation(libs.spoofax.meta.sdf3.ext.statix)
    implementation(libs.spoofax.meta.statix.runtime)
    implementation(libs.spoofax.lang.stratego2)

    // Collections
    implementation(libs.capsule)

    // Dependency Injection
    implementation(libs.guice)
    implementation(libs.dagger)
    implementation(libs.dagger.compiler)

    // Annotations & Annotation Processing
    implementation(libs.immutables.value)
    implementation(libs.immutables.serial)
    implementation(libs.derive4j)
    implementation(libs.derive4j.annotation)
    implementation(libs.jakarta.annotation)
    implementation(libs.jakarta.inject)
    implementation(libs.javax.inject)
    implementation(libs.checkerframework.android)

    // Maven
    implementation(libs.maven.resolver.api)
    implementation(libs.maven.resolver.impl)
    implementation(libs.maven.resolver.connector.basic)
    implementation(libs.maven.resolver.transport.file)
    implementation(libs.maven.resolver.provider)
    implementation(libs.bnd.gradle)

    // Logging
    implementation(libs.slf4j.simple)
    implementation(libs.slf4j.api)
    implementation(libs.jcl.over.slf4j)
    implementation(libs.logback.core)
    implementation(libs.logback)

    // Data Formats
    implementation(libs.commons.configuration2.jackson)
    implementation(libs.jackson.core)
    implementation(libs.jackson.databind)
    implementation(libs.jackson.annotations)
    implementation(libs.jackson.dataformat.yaml)

    // Utils
    implementation(libs.commons.math3)
    implementation(libs.commons.io)
    implementation(libs.commons.compress)
    implementation(libs.commons.vfs2)
    implementation(libs.commons.lang3)
    implementation(libs.commons.configuration2)
    implementation(libs.guava)
    implementation(libs.failureaccess)
    implementation(libs.rxjava)

    // Testing
    implementation(libs.junit)
    implementation(libs.junit.vintage)
    implementation(libs.junit4)
    implementation(libs.kotest)
    implementation(libs.kotest.assertions)
    implementation(libs.kotest.datatest)
    implementation(libs.kotest.property)
    implementation(libs.equalsverifier)

}

// Do not try to publish this project
tasks.withType<AbstractPublishToMaven>().configureEach { enabled = false }
tasks.named("checkNotDirty") { enabled = false }
tasks.named("assertNotDirty") { enabled = false }
tasks.named("checkSnapshotDependencies") { enabled = false }
