package com.example.summership2023cluj.data.api

import com.example.summership2023cluj.data.Constants
import com.example.summership2023cluj.data.dto.DevicesResponse
import retrofit2.Response
import retrofit2.http.GET

interface ModelsApiService {
    @GET("${Constants.INVENTORY}/models")
    suspend fun getModels(): Response<DevicesResponse>
}