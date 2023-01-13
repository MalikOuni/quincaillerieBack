package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Exchange;
import com.quincaillerie.labor.dao.entities.Product;
import com.quincaillerie.labor.dao.entities.Provider;
import lombok.Data;


import java.util.List;

@Data
public class ExchangeDTO {
    private Long id;
    private String date;
    private Double amount;
    private Double payedAmount;
    private Provider provider;
    private List<Product> products;

    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static ExchangeDTO fromEntityToDto(Exchange entity) {
        ExchangeDTO dto = new ExchangeDTO();
        dto.setId(entity.getId());
        dto.setDate(entity.getDate());
        dto.setAmount(entity.getAmount());
        dto.setProducts(entity.getProducts());
        dto.setPayedAmount(entity.getPayedAmount());
        dto.setProvider(entity.getProvider());
        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Exchange fromDtoToEntity(ExchangeDTO dto) {
        Exchange entity = new Exchange();
        entity.setId(dto.getId());
        entity.setDate(dto.getDate());
        entity.setAmount(dto.getAmount());
        entity.setProducts(dto.getProducts());
        entity.setPayedAmount(dto.getPayedAmount());
        entity.setProvider(dto.getProvider());

        return entity;
    }
}
