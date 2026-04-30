package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.dto;

public class OrderItemDto {
    private Integer sku;
    private Integer amount;

    public OrderItemDto() {
    }

    public OrderItemDto(Integer sku, Integer amount) {
        this.sku = sku;
        this.amount = amount;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
