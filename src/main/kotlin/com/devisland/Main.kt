package com.devisland
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@SpringBootApplication
class DemoApplication{
    @GetMapping("/")
    fun home() = "Hello world"
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}