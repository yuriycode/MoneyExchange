package com.yuriycode.moneyexchange.data.repository

import com.yuriycode.moneyexchange.data.api.RetrofitInstance
import com.yuriycode.moneyexchange.model.beznal.Beznal
import com.yuriycode.moneyexchange.model.beznal.BeznalItem
import com.yuriycode.moneyexchange.model.nal.Nalichka
import com.yuriycode.moneyexchange.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoneys()
    }
}