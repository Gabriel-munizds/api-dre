package com.rb.apis.dre.dtos;

import java.math.BigDecimal;

public class PagamentoDTO {
    private Long idAtendimento;
    private Boolean situacaoPagamento;
    private BigDecimal valorPago;

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
