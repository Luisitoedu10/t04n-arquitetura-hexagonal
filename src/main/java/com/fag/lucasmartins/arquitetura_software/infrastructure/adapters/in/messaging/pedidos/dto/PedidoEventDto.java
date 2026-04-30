package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoEventDto {
    private String zipCode;
    private String customerId;
    private List<OrderItemDto> orderItems;
    private String origin;
    private LocalDateTime occurredAt;

    public PedidoEventDto() {
    }

    public PedidoEventDto(String zipCode, String customerId, 
                          List<OrderItemDto> orderItems, String origin, LocalDateTime occurredAt) {
        this.zipCode = zipCode;
        this.customerId = customerId;
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
