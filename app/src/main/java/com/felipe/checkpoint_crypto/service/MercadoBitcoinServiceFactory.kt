package com.felipe.checkpoint_crypto.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MercadoBitcoinServiceFactory {
    fun create(): MercadoBitcoinService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.mercadobitcoin.net/") // Define a base da URL
            .addConverterFactory(GsonConverterFactory.create()) // Converte JSON automaticamente
            .build()

        return retrofit.create(MercadoBitcoinService::class.java) // Cria o serviço Retrofit
    }
}