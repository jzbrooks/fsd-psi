import com.diffplug.gradle.spotless.SpotlessExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.grammarKit)
    alias(libs.plugins.spotless)
}

group = "io.github.facilityapi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://www.jetbrains.com/intellij-repository/releases") }
    maven { url = uri("https://cache-redirector.jetbrains.com/intellij-dependencies") }
    maven { url = uri("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
}

dependencies {
    compileOnly(libs.intellijLang)
    compileOnly(libs.intellijCore)
    testImplementation(kotlin("test"))
}

grammarKit {
    intellijRelease.set(libs.versions.ideaVersion)
}

sourceSets["main"].java.srcDirs("src/main/gen")

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

subprojects {
    apply(plugin = "com.diffplug.spotless")

    configure<SpotlessExtension> {
        kotlin {
            ktlint("0.47.1")
                // Spotless doesn't respect .editorconfig yet.
                //   https://github.com/diffplug/spotless/issues/142
                .editorConfigOverride(
                    mapOf(
                        "charset" to "utf-8",
                        "end_of_line" to "lf",
                        "trim_trailing_whitespace" to true,
                        "insert_final_newline" to true,
                        "indent_style" to "space",
                        "indent_size" to 4,
                        "ij_kotlin_allow_trailing_comma" to true,
                        "ij_kotlin_allow_trailing_comma_on_call_site" to true
                    )
                )
        }

        kotlinGradle {
            ktlint("0.47.1")
                // Spotless doesn't respect .editorconfig yet.
                //   https://github.com/diffplug/spotless/issues/142
                .editorConfigOverride(
                    mapOf(
                        "charset" to "utf-8",
                        "end_of_line" to "lf",
                        "trim_trailing_whitespace" to true,
                        "insert_final_newline" to true,
                        "indent_style" to "space",
                        "indent_size" to 4,
                        "ij_kotlin_allow_trailing_comma" to true,
                        "ij_kotlin_allow_trailing_comma_on_call_site" to true
                    )
                )
        }
    }
}
