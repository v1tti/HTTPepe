package com.pepe.httpepe.service;

import com.pepe.httpepe.PepeRepository;
import com.pepe.httpepe.controller.response.ListarPepeResponse;
import com.pepe.httpepe.mapper.ListarPepeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarPepeService {

    @Autowired
    private PepeRepository pepeRepository;
    public List<ListarPepeResponse> listar() {
        return pepeRepository.findAll()
                .stream()
                .map(ListarPepeMapper::toResponse)
                .collect(Collectors.toList());

    }
}
