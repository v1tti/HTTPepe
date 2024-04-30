package com.pepe.httpepe.controller;

import com.pepe.httpepe.controller.response.ListarPepeResponse;
import com.pepe.httpepe.service.ListarPepeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/pepes")
@CrossOrigin(origins = "*")
public class PepeController {

    @Autowired
    private ListarPepeService listarPepeService;

    @GetMapping
    public List<ListarPepeResponse> listar(){
        return listarPepeService.listar();
    }
}
