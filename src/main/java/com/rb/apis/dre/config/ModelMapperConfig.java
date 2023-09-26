package com.rb.apis.dre.config;

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
                .addMapping(fornecedor -> fornecedor.getId(), FornecedorDtoOut::setId);

        return modelMapper;
    }
}
