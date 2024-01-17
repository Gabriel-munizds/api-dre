package com.rb.apis.dre.repository;

import com.rb.apis.dre.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamentos, Long> {

}
