package com.fag.lucasmartins.arquitetura_software.application.ports.in.service;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;

public interface  PessoaServicePort {
    PessoaBo salvar(PessoaBo pessoaBo);
}
