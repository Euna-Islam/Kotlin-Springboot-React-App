package com.euna.kotlin.server

import com.euna.kotlin.server.entity.BookModel
import com.euna.kotlin.server.repository.BookRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ServerApplication {
	@Bean
	fun run(repository: BookRepository) = ApplicationRunner {
		repository.save(BookModel(
				name = "English",
				author = "X",
		))

		repository.save(BookModel(
				name = "Bangla",
				author = "Y",
		))
	}
}

fun main(args: Array<String>) {
	runApplication<ServerApplication>(*args)
}
