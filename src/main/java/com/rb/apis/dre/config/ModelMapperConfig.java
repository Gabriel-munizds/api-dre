package com.rb.apis.dre.config;

import com.rb.apis.dre.dtos.FornecedorDtoIn;
import com.rb.apis.dre.dtos.FornecedorDtoOut;
import com.rb.apis.dre.model.Fornecedor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ModelMapperConfig {

    @Bean
    @Primary
    public ModelMapper config(){

        ModelMapper modelMapper = new ModelMapper();

        modelMapper.createTypeMap(Fornecedor.class, FornecedorDtoOut.class)
                .addMapping(Fornecedor::getId, FornecedorDtoOut::setId)
                .addMapping(Fornecedor::getCpfCnpj, FornecedorDtoOut::setCpfCnpj)
                .addMapping(Fornecedor::getNomeRazao, FornecedorDtoOut::setNome);

        modelMapper.createTypeMap(FornecedorDtoIn.class, Fornecedor.class)
                .addMapping(FornecedorDtoIn::getCpfCnpj, Fornecedor::setCpfCnpj)
                .addMapping(FornecedorDtoIn::getNome, Fornecedor::setNomeRazao);



        return modelMapper;
    }
}
