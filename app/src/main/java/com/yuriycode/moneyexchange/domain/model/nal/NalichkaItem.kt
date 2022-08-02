package com.yuriycode.moneyexchange.domain.model.nal

data class NalichkaItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)