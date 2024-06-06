package com.redes.cotacao_api.service.impl;

import com.redes.cotacao_api.client.CotacaoClient;
import com.redes.cotacao_api.service.CotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CotacaoServiceImpl implements CotacaoService {
    @Autowired
    CotacaoClient cotacaoClient;
    @Override
    public Object getCotacao() {
        return cotacaoClient.getCotacao();
    }
}
