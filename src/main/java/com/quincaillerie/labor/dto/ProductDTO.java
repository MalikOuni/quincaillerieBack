package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Exchange;
import com.quincaillerie.labor.dao.entities.Product;
import com.quincaillerie.labor.dao.entities.Sale;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String image;
    private String reference;
    private Double price;
    private String description;
    private String quantity;
    private String soldQuantity;
    private List<Sale> sold;
    private Exchange exchange;

    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static ProductDTO fromEntityToDto(Product entity) {
        ProductDTO dto = new ProductDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setReference(entity.getReference());
        dto.setImage(entity.getImage());
        dto.setDescription(entity.getDescription());
        dto.setQuantity(entity.getQuantity());
        dto.setSoldQuantity(entity.getSoldQuantity());
        dto.setSold(entity.getSold());
        dto.setPrice(entity.getPrice());
        dto.setExchange(entity.getExchange());

        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Product fromDtoToEntity(ProductDTO dto) {
        Product entity = new Product();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setReference(dto.getReference());
        entity.setImage(dto.getImage());
        entity.setDescription(dto.getDescription());
        entity.setQuantity(dto.getQuantity());
        entity.setSoldQuantity(dto.getSoldQuantity());
        entity.setSold(dto.getSold());
        entity.setPrice(dto.getPrice());
        entity.setExchange(dto.getExchange());
        return entity;
    }
}
