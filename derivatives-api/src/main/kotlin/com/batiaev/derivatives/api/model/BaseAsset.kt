package com.batiaev.derivatives.api.model

import org.jetbrains.annotations.NotNull

/**
 * BaseAsset
 *
 * @author anton
 * @since 17/12/17
 */
data class BaseAsset(@NotNull val code: String, val ticker: String?, val name: String?)