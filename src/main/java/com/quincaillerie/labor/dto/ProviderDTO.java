package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Provider;
import com.quincaillerie.labor.dao.entities.Exchange;
import lombok.Data;


import java.util.List;

@Data
public class ProviderDTO {
    private Long id;
    private String name;
    private Integer phone;
    private String address;
    private String email;
    private List<Exchange> exchanges;
    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static ProviderDTO fromEntityToDto(Provider entity) {
        ProviderDTO dto = new ProviderDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setExchanges(entity.getExchanges());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        dto.setEmail(entity.getEmail());

        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Provider fromDtoToEntity(ProviderDTO dto) {
        Provider entity = new Provider();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setExchanges(dto.getExchanges());
        entity.setPhone(dto.getPhone());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());

        return entity;
    }
}
