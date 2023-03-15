package com.example.kitaplamo
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class communicator :ViewModel() {
    val lamoId=MutableLiveData<Any>()

    fun set_lamoId(id:Int){
        lamoId.setValue(id);
    }
}