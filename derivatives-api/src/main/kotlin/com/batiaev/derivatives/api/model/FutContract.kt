package com.batiaev.derivatives.api.model

import com.batiaev.derivatives.api.MOEX_URL
import java.time.Month

/**
 * FutContract
 *
 * @author anton
 * @since 16/12/17
 */
data class FutContract(val ticker: String,
                       @Transient val baseAsset: Any,
                       @Transient val year: Int,
                       @Transient val month: Month) {
    @Transient
    val type: ContractType = ContractType.FUTURES

    @Transient
    val moexDetails: String = MOEX_URL + ticker
}
