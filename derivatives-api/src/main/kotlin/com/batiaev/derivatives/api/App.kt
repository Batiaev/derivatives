package com.batiaev.derivatives.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * App
 *
 * @author anton
 * @since 16/12/17
 */
@SpringBootApplication
class App

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}

const val MOEX_URL = "http://www.moex.com/ru/contract.aspx?code="