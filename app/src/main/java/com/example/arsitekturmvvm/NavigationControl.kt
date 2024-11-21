package com.example.arsitekturmvvm

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.arsitekturmvvm.model.JenisKelamin.jenisK
import com.example.arsitekturmvvm.ui.view.FormulirView
import com.example.arsitekturmvvm.ui.view.TampilData
import com.example.arsitekturmvvm.ui.view.TampilDataView
import com.example.arsitekturmvvm.viewmodel.SiswaViewModel

enum class Halaman {                                     //menandai nama per halaman
    FORMULIR,
    TAMPILDATA
}

@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    // navController: NavHostController = rememberNavController(),          //yg mengatur nav
    navHost: NavHostController = rememberNavController()
){

}