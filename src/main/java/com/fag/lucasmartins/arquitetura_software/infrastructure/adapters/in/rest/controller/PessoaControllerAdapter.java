package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fag.lucasmartins.arquitetura_software.application.ports.in.service.PessoaServicePort;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBo;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDto;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper.PessoaDtoMapper;

@RestController
@RequestMapping("/pessoas")
public class PessoaControllerAdapter {

    private final PessoaServicePort pessoaServicePort;

    public PessoaControllerAdapter(PessoaServicePort pessoaServicePort) {
        this.pessoaServicePort = pessoaServicePort;
    }

    @PostMapping
    public ResponseEntity<PessoaDto> cadastrarPessoa(@RequestBody PessoaDto pessoaDto) {
        PessoaBo pessoaBo = PessoaDtoMapper.toBo(pessoaDto);

        PessoaBo pessoaCadastradaBo = pessoaServicePort.salvar(pessoaBo);

        PessoaDto pessoaCadastradaDto = PessoaDtoMapper.toDto(pessoaCadastradaBo);

        return ResponseEntity.status(201).body(pessoaCadastradaDto);
    }
}