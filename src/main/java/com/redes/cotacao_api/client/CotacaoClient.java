package com.redes.cotacao_api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cotacao", url = "https://economia.awesomeapi.com.br/last")
@Component
public interface CotacaoClient {
    @GetMapping("/BTC-BRL")
    Object getCotacao();
}
