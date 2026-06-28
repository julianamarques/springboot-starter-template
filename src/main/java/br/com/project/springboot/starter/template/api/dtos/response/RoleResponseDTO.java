package br.com.project.springboot.starter.template.api.dtos.response;

import br.com.project.springboot.starter.template.api.entities.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class RoleResponseDTO {
    private String name;

    public RoleResponseDTO(Role role) {
        this.name = role.getName().name();
    }

    public static List<RoleResponseDTO> convertToListDTO(List<Role> roles) {
        if (Objects.isNull(roles)) {
            return List.of();
        }

        return roles.stream().map(RoleResponseDTO::new).toList();
    }
}
