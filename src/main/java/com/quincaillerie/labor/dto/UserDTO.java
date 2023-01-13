package com.quincaillerie.labor.dto;

import com.quincaillerie.labor.dao.entities.Role;
import com.quincaillerie.labor.dao.entities.User;
import lombok.Data;

/**
 * Data Transfer Object :
 * It's a representation for our entity.
 *
 * Note: When using DTO objects, we certainly need to introduce 2 methods called "MappingMethods"
 *       used in order to transform an entity to a DTO and a DTO to an entity
 */
@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Role role;


    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static UserDTO fromEntityToDto(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static User fromDtoToEntity(UserDTO dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());
        return entity;
    }
}

