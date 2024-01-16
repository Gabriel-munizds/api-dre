package com.rb.apis.dre.controller;

import com.rb.apis.dre.dtos.FornecedorDtoIn;
import com.rb.apis.dre.dtos.FornecedorDtoOut;
import com.rb.apis.dre.services.FornecedorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/select")
    public ResponseEntity<List<FornecedorDtoOut>> listarTodosFonecedores(){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorService.listarTodosFornecedores());
    }

    @GetMapping("/listar")
    public ResponseEntity<Page<FornecedorDtoOut>> buscarFornecedoresByParam(@RequestParam(required = false)Long id,
                                                                            @RequestParam(required = false)String nome,
                                                                            Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorService.buscarFornecedoresByParam(id, nome, pageable));
    }
}
