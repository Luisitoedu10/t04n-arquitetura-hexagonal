package com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;

public interface PessoaRepositoryPort {
    PessoaBo salvar(PessoaBo pessoaBo);
}
