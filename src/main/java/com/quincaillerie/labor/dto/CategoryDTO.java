package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Category;
import com.quincaillerie.labor.dao.entities.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private String image;
    private List<Product> products;

    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static CategoryDTO fromEntityToDto(Category entity) {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setName(entity.getName());
        dto.setProducts(entity.getProducts());

        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Category fromDtoToEntity(CategoryDTO dto) {
        Category entity = new Category();
        entity.setId(dto.getId());
        entity.setImage(dto.getImage());
        entity.setName(dto.getName());
        entity.setProducts(dto.getProducts());

        return entity;
    }
}
