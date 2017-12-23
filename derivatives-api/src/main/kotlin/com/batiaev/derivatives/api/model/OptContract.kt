package com.batiaev.derivatives.api.model

import com.batiaev.derivatives.api.MOEX_URL
import java.time.Month

/**
 * OptContract
 *
 * @author anton
 * @since 16/12/17
 */
data class OptContract(val ticker: String,
                       @Transient val baseAsset: Any,
                       @Transient val strike: String,
                       @Transient val optionType: OptionType,
                       @Transient val year: Int,
                       @Transient val month: Month,
                       @Transient val isWeekly: Boolean = false,
                       @Transient val optionExpirationWeek: Int = 3) {

    @Transient
    val type: ContractType = ContractType.OPTION

    @Transient
    val moexDetails: String = MOEX_URL + ticker
}
