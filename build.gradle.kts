plugins {
	id("java")
	id("maven-publish")
	id("fabric-loom") version("1.4-SNAPSHOT")
}

group = project.properties["maven_group"] as String
version = project.properties["mod_version"] as String

repositories {
	mavenCentral()
	maven("https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
	maven("https://maven.architectury.dev/")
	maven("https://maven.terraformersmc.com/releases/")
}

// Declare dependencies
dependencies {
	// Fabric
	minecraft("com.mojang:minecraft:1.20.2")
	mappings("net.fabricmc:yarn:1.20.2+build.4:v2")
	modImplementation("net.fabricmc:fabric-loader:0.14.24")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.90.4+1.20.2")

	// Mods
	modImplementation("software.bernie.geckolib:geckolib-fabric-1.20.2:4.2.4")
	modApi("com.terraformersmc:modmenu:8.0.0-beta.2")
}

java {
	withSourcesJar()
}

java {
	sourceCompatibility = JavaVersion.VERSION_21
	targetCompatibility = JavaVersion.VERSION_21
}
