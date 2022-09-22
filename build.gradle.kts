import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.13.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    id("java")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    maven {
        url = uri("https://maven.aliyun.com/nexus/content/groups/public/")
    }
//	mavenCentral()
}

dependencies {
    implementation("cn.hutool:hutool-all:5.8.7")
    implementation("com.fhs-opensource:easy-trans-spring-boot-starter:2.0.3")
    implementation("com.fhs-opensource:easy-trans-mybatis-plus-extend:2.0.3")
    implementation("com.fhs-opensource:easy-trans-tk-extend:2.0.3")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.5.2")
    implementation("com.github.pagehelper:pagehelper-spring-boot-starter:1.4.5")
    annotationProcessor("com.github.atool:fluent-mybatis-processor:1.9.8")
    compileOnly("com.github.atool:fluent-mybatis-processor:1.9.8")
    implementation("com.github.atool:fluent-mybatis-boot-starter:1.9.8")
    implementation("com.fhs-opensource:easy-trans-tk-extend:2.0.3")
    implementation("com.alibaba:druid-spring-boot-starter:1.2.12")
    runtimeOnly("mysql:mysql-connector-java:8.0.30")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    enabled = false
    useJUnitPlatform()
}
sourceSets {
    main {
        java.srcDir("src/main/java")
    }
    test {
        java.srcDir("src/test/java")
    }
}