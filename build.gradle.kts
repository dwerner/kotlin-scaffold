plugins {
	kotlin("jvm") version "1.2.30" 
}

repositories {
	jcenter()
}

dependencies {
	implementation(kotlin("stdlib", "1.2.30"))
	testCompile("junit:junit:4.12")

}
