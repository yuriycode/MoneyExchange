package com.yuriycode.moneyexchange.model.nal

data class NalichkaItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)