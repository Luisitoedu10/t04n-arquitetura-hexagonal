package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.mapper;

import java.util.ArrayList;
import java.util.List;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PedidoBO;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PedidoProdutoBO;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.dto.OrderItemDto;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.pedidos.dto.PedidoEventDto;

public class PedidoDtoMapper {

    public static PedidoBO toBO(PedidoEventDto pedidoEventDto) {
        if (pedidoEventDto == null) {
            return null;
        }

        PedidoBO pedido = new PedidoBO();
        
        if (pedidoEventDto.getCustomerId() != null && !pedidoEventDto.getCustomerId().isEmpty()) {
            try {
                PessoaBO pessoa = new PessoaBO();
                pessoa.setId(Integer.parseInt(pedidoEventDto.getCustomerId()));
                pedido.setPessoa(pessoa);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("CustomerId inválido: " + pedidoEventDto.getCustomerId(), e);
            }
        }
        
        pedido.setCep(pedidoEventDto.getZipCode());

        if (pedidoEventDto.getOrderItems() != null && !pedidoEventDto.getOrderItems().isEmpty()) {
            List<PedidoProdutoBO> itens = new ArrayList<>();
            
            for (OrderItemDto orderItem : pedidoEventDto.getOrderItems()) {
                PedidoProdutoBO item = new PedidoProdutoBO();
                item.setQuantidade(orderItem.getAmount());

                ProdutoBO produto = new ProdutoBO();
                // Converter SKU (String) para Integer
                if (orderItem.getSku() != null) {
                    try {
                        produto.setId(orderItem.getSku());
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("SKU inválido: " + orderItem.getSku(), e);
                    }
                }
                item.setProduto(produto);

                itens.add(item);
            }
            
            pedido.setItens(itens);
        }

        return pedido;
    }
}

