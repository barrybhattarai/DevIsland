package com.devisland
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@RestController
@SpringBootApplication
class DemoApplication{
    @GetMapping("/")
    fun home() = "Hello world"

    @GetMapping("/time")
    fun time():String {
        val now = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a")
        return formatter.format(now)
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}