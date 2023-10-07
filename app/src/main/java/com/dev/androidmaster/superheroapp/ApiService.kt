package com.dev.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/6452817554808898/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    // https://superheroapi.com/api/access-token/character-id
    @GET("/api/6452817554808898/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String): Response<SuperheroDetailResponse>
}