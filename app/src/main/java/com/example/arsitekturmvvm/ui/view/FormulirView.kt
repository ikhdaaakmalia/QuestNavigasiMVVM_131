package com.example.arsitekturmvvm.ui.view

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    listJK: List<String>,       //akan dipanggil function formulir view
    onSubmitClicked:(MutableList<String>) -> Unit) //unit untuk menghandel on click/on submit tipe data dlm parameter
{
    var nama by remember { mutableStateOf("") }                 //bertipe string karena ada tanda petik, jika int maka berisi angka
    var nim by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }                //variabel harus lowercase
    var alamat by remember { mutableStateOf("") }
    var noTelp by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    val listData : MutableList<String> = mutableListOf(nama, nim, gender,email, alamat, noTelp)

    Column (modifier = modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally)
    {
        TextField(
            value = nama,
            onValueChange = {nama = it},                            //memanggil nama sesuai yg di tulis pada Nama (value)
            label = {
                Text(text = "Nama")
            },
            placeholder = {                                         //unit itu dlm wget maka ditaruhdi dlm kurung kurawal
                Text(text = "isi nama anda")                        //hint
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        TextField(
            value = nim,
            onValueChange = {nim = it},                            //memanggil nama sesuai yg di tulis pada Nama (value)
            label = {
                Text(text = "NIM")
            },
            placeholder = {                                         //unit itu dlm wget maka ditaruhdi dlm kurung kurawal
                Text(text = "isi NIM anda")                        //hint
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){                       //looping untuk radio gender
            listJK.forEach{selectedGender ->
                Row(verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = gender == selectedGender,
                        onClick = {gender = selectedGender}
                    )
                    Text(text = selectedGender)}
            }
        }

    }
}
