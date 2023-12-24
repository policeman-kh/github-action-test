project(":app2") {
    tasks {
        bootJar {
            enabled = true
        }

        jar {
            enabled = false
        }
    }
}
