package com.greeting.controller

import mu.KLogging
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class GreetingController {

    companion object : KLogging()

    @GetMapping
    fun greeting(@RequestParam("name") name : String ): String {
        logger.info("Name is : {}",  name)
        return "Hello! $name"
    }
}