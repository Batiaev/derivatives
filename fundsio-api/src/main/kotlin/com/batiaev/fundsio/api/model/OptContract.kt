package com.batiaev.fundsio.api.model

import java.time.Month

/**
 * OptContract
 *
 * @author anton
 * @since 16/12/17
 */
data class OptContract(val ticker: String,
                       @Transient val baseAsset: String,
                       @Transient val strike: String,
                       @Transient val optionType: OptionType,
                       @Transient val year: Int,
                       @Transient val month: Month) {
    @Transient
    val type: ContractType = ContractType.OPTION
}
