package com.batiaev.fundsio.api

import com.batiaev.fundsio.api.model.FutContract
import com.batiaev.fundsio.api.model.OptContract
import com.batiaev.fundsio.api.model.OptionType
import java.time.LocalDate
import java.time.Month

/**
 * Parser
 *
 * @author anton
 * @since 16/12/17
 */
class Parser {
    companion object {
        fun parseOptTicker(ticker: String): OptContract {
            val baseAsset = ticker.substring(0, 2)
            val strike = "1200"//FIXME

            val currYear = LocalDate.now().year
            var year = currYear / 10 * 10 + Integer.valueOf(ticker.substring(ticker.length - 1))
            if (year < currYear) year += 10;
            val monthChar = ticker.substring(ticker.length - 2, ticker.length - 1)

            var month = Month.JANUARY
            var optType = if (monthChar < "M") OptionType.CALL else OptionType.PUT
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
            return OptContract(ticker, baseAsset, strike, optType, year, month);
        }

        fun parseFutTicker(ticker: String): FutContract {

            val baseAsset = ticker.substring(0, 2)
            val year = LocalDate.now().year / 10 * 10 + Integer.valueOf(ticker.substring(ticker.length - 1))
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
            return FutContract(ticker, baseAsset, year, month)
        }
    }
}