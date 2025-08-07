package helpers

import org.gradle.jvm.toolchain.JvmVendorSpec

object LibericaNativeVendor : JvmVendorSpec() {
    override fun matches(vendor: String): Boolean {
        return vendor.contains("Liberica-NIK", ignoreCase = true)
            || vendor.contains("Liberica Native", ignoreCase = true)
    }
}
