package com.pepe.httpepe.controller.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ListarPepeResponse {

    private Long id;
    private String url;
    private String name;
    private String httpCode;
}
