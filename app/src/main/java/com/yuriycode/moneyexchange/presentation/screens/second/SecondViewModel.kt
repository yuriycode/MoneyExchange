package com.yuriycode.moneyexchange.presentation.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yuriycode.moneyexchange.data.repository.Repository
import com.yuriycode.moneyexchange.domain.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }

    }
}