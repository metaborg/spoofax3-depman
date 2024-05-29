rootProject.name = "spoofax3-depman"

pluginManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
}

include(":catalog")
include(":platform")