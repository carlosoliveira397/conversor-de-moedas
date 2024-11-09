package com.moeda.util;

import com.google.gson.*;

import java.lang.reflect.Type;

public class CotacaoAdapter implements JsonDeserializer<Cotacao> {
	
	//ADAPTADOR

    @Override
    public Cotacao deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String baseCode = jsonObject.get("base_code").getAsString();
        String targetCode = jsonObject.get("target_code").getAsString();
        String conversionResult = jsonObject.get("conversion_result").getAsString();

        return new Cotacao(baseCode, targetCode, conversionResult);
    }
}