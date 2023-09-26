package com.rb.apis.dre.controller;

import com.rb.apis.dre.dtos.FornecedorDtoIn;
import com.rb.apis.dre.dtos.FornecedorDtoOut;
import com.rb.apis.dre.services.FornecedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/fornecedor")
@RestController
public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }
    @PostMapping("/criar")
    public ResponseEntity<FornecedorDtoOut> criarFornecedor(@RequestBody FornecedorDtoIn dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorService.criarFornecedor(dto));
    }
    @GetMapping("/detalhar/{id}")
    public ResponseEntity<FornecedorDtoOut> detalharFornecedor(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorService.detalharFornecedor(id));
    }

}
