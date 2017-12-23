package com.batiaev.derivatives.api.controller

import com.batiaev.derivatives.api.Parser
import com.batiaev.derivatives.api.model.FutContract
import com.batiaev.derivatives.api.model.OptContract
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * RestController
 *
 * @author anton
 * @since 16/12/17
 */
@RestController
class RestController @Autowired constructor(
        private val parser: Parser
) {
    @GetMapping("/")
    fun index(): String {
        return "<!DOCTYPE html><html><head><meta charset=\"utf-8\">" +
                "<title>FORTS ticker parser</title></head><body>" +
                "<form action=\"./parse\" method=\"GET\">" +
                "<input type=\"text\" name=\"ticker\" placeholder=\"add ticker e.g. SiH8\"> " +
                "<input type=\"submit\" value=\"Parse\">" +
                "</form>" +
                "</body></html>"
    }

    @GetMapping("/parse")
    fun parse(@RequestParam(value = "ticker", defaultValue = "SiH8") ticker: String): Any {
        return if (ticker.length == 4 || ticker.length == 6) parser.parseFutTicker(ticker);
        else parser.parseOptTicker(ticker)
    }

    @GetMapping("/parseFutures")
    fun parseFutures(@RequestParam(value = "ticker", defaultValue = "SiH8") ticker: String): FutContract {
        return parser.parseFutTicker(ticker)
    }

    @GetMapping("/parseOption")
    fun parseOption(@RequestParam(value = "ticker", defaultValue = "RI130000BC6") ticker: String): OptContract {
        return parser.parseOptTicker(ticker)
    }
}
