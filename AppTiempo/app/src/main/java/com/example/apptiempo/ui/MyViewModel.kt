package com.example.apptiempo.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.apptiempo.data.Repository
import com.example.apptiempo.data.model.Tiempo
import com.example.apptiempo.data.model.Weather
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {


    private val repository = Repository()
    val liveData = MutableLiveData<Tiempo?>()


    fun tiempo(lat: Double, lon:Double){

        CoroutineScope(Dispatchers.IO).launch {
            val respuesta = repository.tiempo(lat,lon,"3ce1a70f037beb728094dac99524ab84","es","metric")

            if(respuesta.isSuccessful){
                val mirespuesta = respuesta.body()
                liveData.postValue(mirespuesta)
            }

        }
    }




}