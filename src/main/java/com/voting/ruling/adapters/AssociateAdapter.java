package com.voting.ruling.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.voting.ruling.model.Associate;
import com.voting.ruling.model.Ruling;
import com.voting.ruling.model.Session;
import com.voting.ruling.utils.DateUtils;

import java.lang.reflect.Type;
import java.util.Date;

import static java.util.Objects.nonNull;

public class AssociateAdapter implements JsonSerializer<Associate> {


    @Override
    public JsonElement serialize(Associate associate, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("id", associate.getId());
        jsonObject.addProperty("name", associate.getName());
        jsonObject.addProperty("lastName", associate.getLastName() );
        jsonObject.addProperty("cpf", associate.getCpf());

        return jsonObject;
    }
}
