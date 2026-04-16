package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;

public class PessoaMapper {

    private PessoaMapper() {

    }

    public static PessoaEntity toEntity(PessoaBo pessoaBo) {
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setNomeCompleto(pessoaBo.getNomeCompleto());
        pessoaEntity.setCpf(pessoaBo.getCpf());
        pessoaEntity.setEmail(pessoaBo.getEmail());
        pessoaEntity.setTelefone(pessoaBo.getTelefone());
        pessoaEntity.setDataNascimento(pessoaBo.getDataNascimento());

        return pessoaEntity;
    }

    public static PessoaBo toBo(PessoaEntity pessoaEntity) {
        PessoaBo pessoaBo = new PessoaBo();
        pessoaBo.setNomeCompleto(pessoaEntity.getNomeCompleto());
        pessoaBo.setCpf(pessoaEntity.getCpf());
        pessoaBo.setEmail(pessoaEntity.getEmail());
        pessoaBo.setTelefone(pessoaEntity.getTelefone());
        pessoaBo.setDataNascimento(pessoaEntity.getDataNascimento());

        return pessoaBo;
    }
}
