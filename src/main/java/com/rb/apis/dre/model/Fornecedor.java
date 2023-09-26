package com.rb.apis.dre.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor", schema = "dre")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FORNECEDOR")
    private Long id;
    @Column(name = "NOME_FORNECEDOR")
    private String nomeRazao;
    @Column(name = "CNPJ_FORNECEDOR")
    private String cpfCnpj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
