package com.euna.kotlin.server.entity

import com.euna.kotlin.server.entity.BookModel
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
interface BookRepository: CrudRepository<BookModel, Long> {
}