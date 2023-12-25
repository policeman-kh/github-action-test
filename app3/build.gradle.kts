import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

dependencies {
    implementation(project(":app1"))
    implementation(project(":app2"))
}

tasks.getByName<BootJar>("bootJar") {
    mainClass.set("sandbox.Main3")
}
