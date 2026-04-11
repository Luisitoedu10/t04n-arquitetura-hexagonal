package com.fag.lucasmartins.arquitetura_software.core.domain.bo;

import java.time.LocalDate;
import java.time.Period;

import com.fag.lucasmartins.arquitetura_software.core.domain.exceptions.DomainException;

public class PessoaBo {

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    LocalDate hoje = LocalDate.now();
    int idade = Period.between(this.dataNascimento, hoje).getYears();

    public void validarMaioridadePessoa() {
        if (idade < 18) {
            throw new DomainException("Erro: Você deve ter pelo menos 18 anos.");
        }
    }

    public void validarCpfPessoa() {
        if (this.cpf.length() != 11) {
            throw new DomainException("Erro: O CPF deve conter exatamente 11 números.");
        }
    }

    public void validarTelefonePessoa() {
        if ((this.telefone.length() != 11) || (this.telefone.contains("-")) || 
        (this.telefone.contains("(")) || (this.telefone.contains(")"))) {
            throw new DomainException("Erro: O telefone deve somente números, e deve conter 11 números.");
        }
    }

    public void validarEmailPessoa() {
        if (!this.email.contains("@")) {
            throw new DomainException("O email deva conter '@'.");
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
