package com.example.news.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.news.data.network.NewsRepository
import com.example.news.data.network.models.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val repository: NewsRepository): ViewModel() {

    init {
        getSavedArticles()
    }


    fun getSavedArticles() = viewModelScope.launch(Dispatchers.IO) {
        val res = repository.getFavoriteArticles()
        println("DB size: ${res.size}")
        repository.getFavoriteArticles()
    }


}