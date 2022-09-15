package com.example.news.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.news.data.network.models.Article

@Database(entities = [Article::class], version = 1, exportSchema = true)
abstract class ArticleDataBase: RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao

}