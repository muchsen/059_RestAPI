package com.example.restapi.repository

import com.example.pakeapi.model.Kontak
import com.example.pakeapi.network.KontakService

interface KontakRepository{
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}