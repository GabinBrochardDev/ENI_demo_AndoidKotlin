pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Demonstrations"
include(":app")
include(":demokotlin")
include(":mod3demoxml")
include(":mod3compose")
include(":mod3rowcolumn")
include(":mod3spacermodifier")
include(":mod3lazycolumn")
include(":mod4compteur")
include(":mod4formulaire")
include(":mod4vm")
include(":mod4injectiondep")
include(":mod5activites")
include(":mod5testcompose")
include(":mod5nav")
include(":mod6datastore")
include(":mod6room")
include(":mod7apirest")
include(":mod8workmanager")
