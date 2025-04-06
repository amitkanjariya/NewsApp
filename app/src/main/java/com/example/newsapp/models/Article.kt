package com.example.newsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "articles")

data class Article(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,

    val source: Source?, // Source datatype is not supported by database,
                        // since it is an object itself
                        // So we need to use Type Converters for this one

    val title: String?,
    val url: String?,
    val urlToImage: String?
): Serializable