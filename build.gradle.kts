plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = helpers.LibericaNativeVendor
        nativeImageCapable = true
    }
}
