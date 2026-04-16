package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.repository;

import org.springframework.stereotype.Repository;

import com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2.PessoaRepositoryPort;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.jpa.PessoaJpaRepository;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper.PessoaMapper;

@Repository
public class PessoaRepositoryAdapter implements PessoaRepositoryPort{

    private final PessoaJpaRepository pessoaJpaRepository;

    public PessoaRepositoryAdapter(PessoaJpaRepository pessoaJpaRepository) {
        this.pessoaJpaRepository = pessoaJpaRepository;
    }

    @Override
    public PessoaBo salvar(PessoaBo pessoaBo) {
        PessoaEntity pessoaEntity = PessoaMapper.toEntity(pessoaBo);

        pessoaJpaRepository.save(pessoaEntity);

        return PessoaMapper.toBo(pessoaEntity);
    }
}
