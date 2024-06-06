package com.redes.cotacao_api.controller;

import com.redes.cotacao_api.service.CotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cotacao")
public class CotacaoController {
    @Autowired
    CotacaoService cotacaoService;

    @RequestMapping(value="/bitcoin", method = RequestMethod.GET)
    public Object getCotacao(){
        return cotacaoService.getCotacao();
    }
}
