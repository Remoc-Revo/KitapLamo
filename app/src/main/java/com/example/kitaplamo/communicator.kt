package com.example.kitaplamo
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class communicator :ViewModel() {
    val lamoId=MutableLiveData<Any>()

    fun set_lamoId(id:Int){
        lamoId.setValue(id);
    }
}