import org.springframework.boot.gradle.tasks.bundling.BootJar

project(":app2") {
    tasks.getByName<BootJar>("bootJar") {
        enabled = false
    }

    tasks.getByName<Jar>("jar") {
        enabled = true
    }
}
