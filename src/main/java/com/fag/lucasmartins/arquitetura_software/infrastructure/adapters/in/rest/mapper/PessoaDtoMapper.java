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
        bo.setNomeCompleto(dto.getNomeCompleto());
        bo.setTelefone(dto.getTelefone());
        
        return bo;
    }

    public static PessoaDto toDto(PessoaBo bo) {
        final PessoaDto dto = new PessoaDto();
        dto.setCpf(bo.getCpf());
        dto.setDataNascimento(bo.getDataNascimento);
        dto.setEmail(bo.getEmail());
        dto.setNomeCompleto(bo.getNomeCompleto());
        dto.setTelefone(bo.getTelefone());
    }

}
