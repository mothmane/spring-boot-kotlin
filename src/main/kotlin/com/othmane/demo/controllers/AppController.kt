package com.othmane.demo.controllers

import com.othmane.demo.AppConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/app")
class AppController(var appConfig: AppConfig) {


    @GetMapping
    fun name(): String {
        return appConfig.title
    }

    @GetMapping("/desc")
    fun description(): String {
        return appConfig.description
    }


}