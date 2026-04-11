package com.fag.lucasmartins.arquitetura_software.application.services;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.application.ports.in.service.PessoaServicePort;
import com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2.PessoaRepositoryPort;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;

@Service
public class PessoaService implements PessoaServicePort{

    private final PessoaRepositoryPort pessoaRepositoryPort;

    public PessoaService(PessoaRepositoryPort pessoaRepositoryPort) {
        this.pessoaRepositoryPort = pessoaRepositoryPort;
    }

    @Override
    public PessoaBo salvar(PessoaBo pessoaBo) {
        pessoaBo.validarCpfPessoa();
        pessoaBo.validarEmailPessoa();
        pessoaBo.validarMaioridadePessoa();
        pessoaBo.validarTelefonePessoa();

        return pessoaRepositoryPort.salvar(pessoaBo);
    }
}
