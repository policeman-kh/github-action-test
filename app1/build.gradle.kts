project(":app1") {
    tasks {
        bootJar {
            enabled = true
        }

        jar {
            enabled = false
        }
    }
}
