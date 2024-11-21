package com.example.arsitekturmvvm.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.arsitekturmvvm.model.DataSiswa

@Composable
fun TampilDataView(
    uiState: DataSiswa,
    onBackButton: () -> Unit
){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp))
    {
        TampilData(param = "Nama", argum = uiState.nama)
        TampilData(param = "NIM", argum = uiState.nama)
        TampilData(param = "Jenis Kelamin", argum = uiState.gender)
        TampilData(param = "Email", argum = uiState.email)
        TampilData(param = "Alamat", argum = uiState.alamat)
        TampilData(param = "No Telepon", argum = uiState.noTelp)
        Button(onClick = onBackButton, modifier = Modifier.fillMaxWidth()){             //tdk ada {} karena tdk membawa data
            Text(text = "kembali")
        }
    }
}

@Composable
fun TampilData(
    param : String, argum: String                                                   //bikin parameter untuk mempermudah memanggil semuanya
){
    Column (modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = param,
                modifier = Modifier.weight(0.8f))                                    //weight memberi ruang seberapa banyak kpd elemen
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f))
            Text(
                text = argum,
                modifier = Modifier.weight(2f))
        }
    }
}