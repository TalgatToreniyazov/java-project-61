plugins {
    application
    id("java")
    id("checkstyle")
}
repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.0"
    configFile = file("config/checkstyle/checkstyle.xml")
}

tasks.checkstyleMain {
    dependsOn(tasks.compileJava)
}

