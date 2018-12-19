package com.othmane.demo


import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "app.config")
class AppConfig{


    lateinit var title:String;
    lateinit var description:String;

}