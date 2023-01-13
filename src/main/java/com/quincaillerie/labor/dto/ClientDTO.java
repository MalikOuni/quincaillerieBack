package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Client;
import com.quincaillerie.labor.dao.entities.Sale;
import lombok.Data;

import java.util.List;

@Data
public class ClientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer phone;
    private String address;
    private String email;
    private List<Sale> orders;


    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static ClientDTO fromEntityToDto(Client entity) {
        ClientDTO dto = new ClientDTO();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        dto.setEmail(entity.getEmail());
        dto.setOrders(entity.getOrders());

        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Client fromDtoToEntity(ClientDTO dto) {
        Client entity = new Client();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhone(dto.getPhone());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());
        entity.setOrders(dto.getOrders());

        return entity;
    }
}
