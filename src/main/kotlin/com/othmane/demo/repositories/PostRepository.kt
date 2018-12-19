package com.othmane.demo.repositories

import com.othmane.demo.beans.Post
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.webmvc.RepositoryRestController
import java.math.BigDecimal
import java.util.*


interface PostRepository : CrudRepository<Post,UUID>