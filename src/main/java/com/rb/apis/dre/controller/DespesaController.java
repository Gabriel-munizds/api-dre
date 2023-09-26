package com.rb.apis.dre.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/despesas")
@RestController
public class DespesaController {
    @GetMapping("/teste")
    public ResponseEntity testeRota(){
        return ResponseEntity.ok().body("ambiente funcionando");
    }
}
