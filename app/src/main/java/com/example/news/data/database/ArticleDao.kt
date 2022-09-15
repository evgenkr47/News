package com.example.news.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.news.data.network.models.Article
@Dao
interface ArticleDao {
    @Query("SELECT * FROM article_table")
    fun getAllArticles(): List<Article>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article)

    @Delete
    suspend fun delete(article: Article)

}