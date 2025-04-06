package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance
import com.example.newsapp.database.ArticleDAO
import com.example.newsapp.models.Article

class NewsRepository(private val articleDAO: ArticleDAO ){

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchForNews(query: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(query, pageNumber)

    suspend fun insert(article: Article) =
        articleDAO.insert(article)

    suspend fun delete(article: Article) =
        articleDAO.delete(article)

    fun getFavouriteNews() = articleDAO.getAllArticles()
}