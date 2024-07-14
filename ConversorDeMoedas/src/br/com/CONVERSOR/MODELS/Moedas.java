package br.com.CONVERSOR.MODELS;

import com.google.gson.annotations.SerializedName;

public record Moedas(@SerializedName("base_code") String moedaEscolhida,
                     @SerializedName("target_code") String moedaConverter,
                     @SerializedName("conversion_result") double cotacao) {
}
