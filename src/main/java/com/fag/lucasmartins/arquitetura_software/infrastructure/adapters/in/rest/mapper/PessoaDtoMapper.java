package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDto;

public class PessoaDtoMapper {

    private PessoaDtoMapper() {
    }

    public static PessoaBo toBo(PessoaDto dto) {
        final PessoaBo bo = new PessoaBo();
        bo.setCpf(dto.getCpf());
        bo.setDataNascimento(dto.getDataNascimento());
        bo.setEmail(dto.getEmail());
        bo.setNome(dto.getNomeCompleto());
        bo.setTelefone(dto.getTelefone());
        
        return bo;
    }
}
