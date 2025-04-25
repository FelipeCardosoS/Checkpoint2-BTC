package com.felipe.checkpoint_crypto.model

class TickerResponse(
    val ticker: Ticker // Dados do ticker
)

class Ticker(
    val high: String,  // Maior valor
    val low: String,   // Menor valor
    val vol: String,   // Volume negociado
    val last: String,  // Último preço
    val buy: String,   // Preço de compra
    val sell: String,  // Preço de venda
    val date: Long     // Data (timestamp)
)
