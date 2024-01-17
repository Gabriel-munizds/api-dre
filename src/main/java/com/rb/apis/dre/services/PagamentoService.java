package com.rb.apis.dre.services;

import com.rb.apis.dre.dtos.PagamentoDTO;
import com.rb.apis.dre.model.Pagamentos;
import com.rb.apis.dre.repository.PagamentoRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PagamentoService {
    private static final Logger log = LoggerFactory.getLogger(PagamentoService.class);
    private final PagamentoRepository pagamentoRepository;
    private final ModelMapper modelMapper;
    private final RabbitTemplate rabbitTemplate;

    public PagamentoService(PagamentoRepository pagamentoRepository, ModelMapper modelMapper, RabbitTemplate rabbitTemplate) {
        this.pagamentoRepository = pagamentoRepository;
        this.modelMapper = modelMapper;
        this.rabbitTemplate = rabbitTemplate;
    }
    @RabbitListener(queues = "teste")
    @Transactional
    public void receberPagamento(@Payload PagamentoDTO dto){
        log.info("RECEBENDO INFORMAÇÃO DE PAGAMENTO");
        Pagamentos pagamento = modelMapper.map(dto, Pagamentos.class);
        pagamentoRepository.save(pagamento);
        log.info("PAGAMENTO GERADO");
    }


}
