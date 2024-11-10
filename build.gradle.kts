plugins {
    application
}

application {
    mainClass.set("hexlet.code.App")
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
