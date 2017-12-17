package com.batiaev.derivatives.api

import com.batiaev.derivatives.api.model.FutContract
import com.batiaev.derivatives.api.model.OptContract
import com.batiaev.derivatives.api.model.OptionType
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.time.Month

/**
 * Parser
 *
 * @author anton
 * @since 16/12/17
 */
@Component
class Parser(private val repository: AssetRepository) {
    fun parseOptTicker(ticker: String): OptContract {
        val baseAsset = ticker.substring(0, 2)
        val asset = repository.get(baseAsset)

        val currYear = LocalDate.now().year
        val isWeekly = isWeekly(ticker)
        val yearChar: Int
        val monthChar: String
        val optionWeekChar: String?
        val optionWeek: Int
        val strike: String
        if (isWeekly) {
            optionWeekChar = ticker.substring(ticker.length - 1)
            yearChar = Integer.valueOf(ticker.substring(ticker.length - 2, ticker.length - 1))
            monthChar = ticker.substring(ticker.length - 3, ticker.length - 2)
            strike = ticker.substring(2, ticker.length - 4)
        } else {
            optionWeekChar = null
            yearChar = Integer.valueOf(ticker.substring(ticker.length - 1))
            monthChar = ticker.substring(ticker.length - 2, ticker.length - 1)
            strike = ticker.substring(2, ticker.length - 3)
        }
        var year = currYear / 10 * 10 + yearChar
        if (year < currYear) year += 10

        optionWeek = if (isWeekly) {
            when (optionWeekChar) {
                "A" -> 1
                "B" -> 2
                "D" -> 4
                "E" -> 5
                else -> 3
            }
        } else 3
        var month = Month.JANUARY
        val optType = if (monthChar < "M") OptionType.CALL else OptionType.PUT
        when (monthChar) {
            "A" -> month = Month.JANUARY
            "B" -> month = Month.FEBRUARY
            "C" -> month = Month.MARCH
            "D" -> month = Month.APRIL
            "E" -> month = Month.MAY
            "F" -> month = Month.JUNE
            "G" -> month = Month.JULY
            "H" -> month = Month.AUGUST
            "I" -> month = Month.SEPTEMBER
            "J" -> month = Month.OCTOBER
            "K" -> month = Month.NOVEMBER
            "L" -> month = Month.DECEMBER

            "M" -> month = Month.JANUARY
            "N" -> month = Month.FEBRUARY
            "O" -> month = Month.MARCH
            "P" -> month = Month.APRIL
            "Q" -> month = Month.MAY
            "R" -> month = Month.JUNE
            "S" -> month = Month.JULY
            "T" -> month = Month.AUGUST
            "U" -> month = Month.SEPTEMBER
            "V" -> month = Month.OCTOBER
            "W" -> month = Month.NOVEMBER
            "X" -> month = Month.DECEMBER
        }
        return if (isWeekly)
            OptContract(ticker, asset, strike, optType, year, month, true, optionWeek)
        else
            OptContract(ticker, asset, strike, optType, year, month)
    }

    private fun isWeekly(ticker: String): Boolean {
        return try {
            Integer.valueOf(ticker.substring(ticker.length - 1))
            false
        } catch (e: Exception) {
            true
        }
    }

    fun parseFutTicker(ticker: String): FutContract {

        val baseAsset = ticker.substring(0, 2)
        val asset = repository.get(baseAsset)

        val currYear = LocalDate.now().year
        val yearChar = Integer.valueOf(ticker.substring(ticker.length - 1))
        var year = currYear / 10 * 10 + yearChar
        if (year < currYear) year += 10

        val monthChar = ticker.substring(ticker.length - 2, ticker.length - 1)
        var month = Month.JANUARY
        when (monthChar) {
            "F" -> month = Month.JANUARY
            "G" -> month = Month.FEBRUARY
            "H" -> month = Month.MARCH
            "J" -> month = Month.APRIL
            "K" -> month = Month.MAY
            "M" -> month = Month.JUNE
            "N" -> month = Month.JULY
            "Q" -> month = Month.AUGUST
            "U" -> month = Month.SEPTEMBER
            "V" -> month = Month.OCTOBER
            "X" -> month = Month.NOVEMBER
            "Z" -> month = Month.DECEMBER
        }
        return FutContract(ticker, asset, year, month)
    }
}