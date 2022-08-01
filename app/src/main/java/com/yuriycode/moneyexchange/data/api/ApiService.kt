package com.yuriycode.moneyexchange.data.api

import com.yuriycode.moneyexchange.model.beznal.Beznal
import com.yuriycode.moneyexchange.model.beznal.BeznalItem
import com.yuriycode.moneyexchange.model.nal.Nalichka
import com.yuriycode.moneyexchange.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys(): Response<Beznal>
}