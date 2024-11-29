package com.ash.elasticsearchsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ElasticsearchSampleApplication

fun main(args: Array<String>) {
    runApplication<ElasticsearchSampleApplication>(*args)
}
