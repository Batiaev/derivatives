package com.batiaev.derivatives.api.model

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
}
