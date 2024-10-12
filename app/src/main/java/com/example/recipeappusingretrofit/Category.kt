package com.example.recipeappusingretrofit

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDesc: String
)

data class CategoryResponse(val categories: List<Category>)
