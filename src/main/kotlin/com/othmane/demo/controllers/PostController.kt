package com.othmane.demo.controllers

import com.othmane.demo.AppConfig
import com.othmane.demo.repositories.PostRepository
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.websocket.server.PathParam


@RestController
class PostController(val postRepository: PostRepository) {


    @GetMapping("/posts")
    fun all() = postRepository.findAll().toList()

    @GetMapping("/posts/{uuid}")
    fun findById(@PathVariable uuid: String) = postRepository.findById(UUID.fromString(uuid)).get()


}