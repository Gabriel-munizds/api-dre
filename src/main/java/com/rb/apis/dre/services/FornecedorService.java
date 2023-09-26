package com.rb.apis.dre.services;

import com.rb.apis.dre.dtos.FornecedorDtoOut;
import com.rb.apis.dre.repository.FornecedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;
    private final ModelMapper modelMapper;

    public FornecedorService(FornecedorRepository fornecedorRepository, ModelMapper modelMapper) {
        this.fornecedorRepository = fornecedorRepository;
        this.modelMapper = modelMapper;
    }


    public FornecedorDtoOut criarFornecedor(){
        return null;
    }
}
