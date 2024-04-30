package com.pepe.httpepe.mapper;

import com.pepe.httpepe.controller.response.ListarPepeResponse;
import com.pepe.httpepe.domain.Pepe;

public class ListarPepeMapper {

    public static ListarPepeResponse toResponse(Pepe entity) {
        ListarPepeResponse response = new ListarPepeResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setHttpCode(entity.getHttpCode());
        response.setUrl(entity.getUrl());

        return response;
    }
}
