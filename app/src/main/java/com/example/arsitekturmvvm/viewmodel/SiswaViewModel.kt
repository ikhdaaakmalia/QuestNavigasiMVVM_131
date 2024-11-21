package com.example.arsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.arsitekturmvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel: ViewModel(){                                      //extend view model : menandai jika ini view model
    private val _statusUI = MutableStateFlow(DataSiswa())               //_ : hanya bisa diakses oleh class itu sendiri (private)
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()        //statusUI tdk private agar bisa diakses oleh view

    fun saveDataSiswa(ls: MutableList<String>){                         //memiliki parameter list dan didalamnya ada update
        _statusUI.update {statusSaatIni ->                              //update artinya status saat ini isinya adalah sebuah model. yg di update ya model nya: nama, gender, alamat
            statusSaatIni.copy(
                nama = ls[0],                                           //ls : didapat dari UI
                nim = ls[1],
                gender = ls[2],
                email = ls[3],
                alamat = ls[4],
                noTelp = ls[5]
            )
        }
    }
}