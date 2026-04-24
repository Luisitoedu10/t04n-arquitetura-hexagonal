package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

public class PedidoEventDto {
    private String zipCode;
    private String customerId;
    private PessoaDTO pessoa;
    private List<OrderItemDto> orderItems;
    private String origin;
    private LocalDateTime occurredAt;

    public PedidoEventDto() {
    }

    public PedidoEventDto(String zipCode, String customerId, PessoaDTO pessoa, 
                          List<OrderItemDto> orderItems, String origin, LocalDateTime occurredAt) {
        this.zipCode = zipCode;
        this.customerId = customerId;
        this.pessoa = pessoa;
        this.orderItems = orderItems;
        this.origin = origin;
        this.occurredAt = occurredAt;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public List<OrderItemDto> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDto> orderItems) {
        this.orderItems = orderItems;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }
}
