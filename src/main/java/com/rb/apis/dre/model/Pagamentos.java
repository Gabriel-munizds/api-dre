package com.rb.apis.dre.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos", schema = "dre")
public class Pagamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pagamento")
    private Long id;
    @Column(name = "fk_id_atendimento")
    private Long idAtendimento;
    @Column(name = "situacao_pagamento")
    private Boolean situacaoPagamento;
    @Column(name = "valor_pago")
    private BigDecimal valorPago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Boolean getSituacaoPagamento() {
        return situacaoPagamento;
    }

    public void setSituacaoPagamento(Boolean situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }
}
