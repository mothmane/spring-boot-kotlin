package com.othmane.demo.beans

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.util.*


@Document
data class Post(@Id  var id: UUID, val text:String, val creationDate:Date)