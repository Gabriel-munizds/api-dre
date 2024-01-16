package com.rb.apis.dre.services;

import com.rb.apis.dre.dtos.FornecedorDtoIn;
import com.rb.apis.dre.dtos.FornecedorDtoOut;
import com.rb.apis.dre.model.Fornecedor;
import com.rb.apis.dre.repository.FornecedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;
    private final ModelMapper modelMapper;

    public FornecedorService(FornecedorRepository fornecedorRepository, ModelMapper modelMapper) {
        this.fornecedorRepository = fornecedorRepository;
        this.modelMapper = modelMapper;
    }
    @Transactional
    public FornecedorDtoOut criarFornecedor(FornecedorDtoIn dto){
        Fornecedor entidade = modelMapper.map(dto, Fornecedor.class);
        fornecedorRepository.save(entidade);
        return modelMapper.map(entidade, FornecedorDtoOut.class);
    }

    private Fornecedor buscarFornecedorById(Long id){
        return fornecedorRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Fornecedor Não Encontrado!"));
    }

    public FornecedorDtoOut detalharFornecedor(Long id){
        Fornecedor fornecedor = buscarFornecedorById(id);
        return modelMapper.map(fornecedor, FornecedorDtoOut.class);
    }


    public List<FornecedorDtoOut> listarTodosFornecedores() {
        return null;
    }

    public Page<FornecedorDtoOut> buscarFornecedoresByParam(Long id, String nome, Pageable pageable) {
        return null;
    }
}
