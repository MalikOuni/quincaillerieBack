package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Client;
import com.quincaillerie.labor.dao.entities.Product;
import com.quincaillerie.labor.dao.entities.Sale;
import lombok.Data;

import java.util.List;

@Data
public class SaleDTO {

    private Long id;
    private String saleDate;
    private Double Amount;
    private Double payedAmount;
    private Integer Discount;

    private Client client;

    private List<Product> productLine;
    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static SaleDTO fromEntityToDto(Sale entity) {
        SaleDTO dto = new SaleDTO();
        dto.setId(entity.getId());
        dto.setSaleDate(entity.getSaleDate());
        dto.setAmount(entity.getAmount());
        dto.setClient(entity.getClient());
        dto.setDiscount(entity.getDiscount());
        dto.setPayedAmount(entity.getPayedAmount());
        dto.setProductLine(entity.getProductLine());
        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Sale fromDtoToEntity(SaleDTO dto) {
        Sale entity = new Sale();
        entity.setId(dto.getId());
        entity.setSaleDate(dto.getSaleDate());
        entity.setAmount(dto.getAmount());
        entity.setClient(dto.getClient());
        entity.setDiscount(dto.getDiscount());
        entity.setPayedAmount(dto.getPayedAmount());
        entity.setProductLine(dto.getProductLine());
        return entity;
    }
}
