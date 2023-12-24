project(":app3") {
    tasks {
        bootJar {
            enabled = true
        }

        jar {
            enabled = false
        }
    }
}
