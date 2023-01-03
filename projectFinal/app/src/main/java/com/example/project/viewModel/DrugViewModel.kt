package com.example.project.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project.model.Drug

class DrugViewModel: ViewModel() {
    val drugs = MutableLiveData<ArrayList<Drug>>(arrayListOf())

}