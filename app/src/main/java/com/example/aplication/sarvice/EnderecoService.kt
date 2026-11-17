package com.example.aplication.sarvice

import android.telecom.Call
import com.example.aplication.model.Endereco
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    @GET("{cep}/json/")
    fun getEnderecoByCep(
        @Path("cep") cep: String
    ): retrofit2.Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUfCidadeRua(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): retrofit2.Call<List<Endereco>>
}