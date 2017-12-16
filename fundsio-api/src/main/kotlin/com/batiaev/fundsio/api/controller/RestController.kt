package com.batiaev.fundsio.api.controller

import com.batiaev.fundsio.api.Parser
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
        else Parser.parseOptTicker(ticker)
    }
}
