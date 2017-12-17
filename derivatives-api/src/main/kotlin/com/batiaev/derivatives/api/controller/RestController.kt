package com.batiaev.derivatives.api.controller

import com.batiaev.derivatives.api.Parser
import com.batiaev.derivatives.api.model.FutContract
import com.batiaev.derivatives.api.model.OptContract
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
class RestController {

    @GetMapping("/parse")
    fun parse(@RequestParam(value = "ticker", defaultValue = "SiH8") ticker: String): Any {
        return if (ticker.length == 4 || ticker.length == 6) Parser.parseFutTicker(ticker);
        else Parser.parseFutTicker(ticker)
    }

    @GetMapping("/parseFutures")
    fun parseFutures(@RequestParam(value = "ticker", defaultValue = "SiH8") ticker: String): FutContract {
        return Parser.parseFutTicker(ticker)
    }

    @GetMapping("/parseOption")
    fun parseOption(@RequestParam(value = "ticker", defaultValue = "RI130000BC6") ticker: String): OptContract {
        return Parser.parseOptTicker(ticker)
    }
}
