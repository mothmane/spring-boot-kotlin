package com.othmane.demo

import com.othmane.demo.beans.Post
import com.othmane.demo.repositories.PostRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*
import java.util.stream.Stream


@SpringBootApplication
class DemoApplication {

    private val log = LoggerFactory.getLogger(DemoApplication::class.java)

    @Bean
    fun commandlineRunner(postRepository: PostRepository) = CommandLineRunner {

        postRepository.deleteAll();
        Stream.of("post 001", "post 002", "post 003", "post 004").forEach {
            postRepository.save(Post(UUID.randomUUID(), it, Date()))
        }

    }

}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}



