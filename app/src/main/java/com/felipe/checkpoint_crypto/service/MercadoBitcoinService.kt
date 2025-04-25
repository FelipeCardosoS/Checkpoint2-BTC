package com.felipe.checkpoint_crypto.service

import com.felipe.checkpoint_crypto.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse> // Chamada GET para buscar dados do ticker do BTC
}