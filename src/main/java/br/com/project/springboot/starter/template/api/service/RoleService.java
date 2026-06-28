package br.com.project.springboot.starter.template.api.service;

import br.com.project.springboot.starter.template.api.entities.Role;
import br.com.project.springboot.starter.template.api.enums.ApiMessageEnum;
import br.com.project.springboot.starter.template.api.enums.RoleEnum;
import br.com.project.springboot.starter.template.api.exceptions.ApiException;
import br.com.project.springboot.starter.template.api.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository repository;

    public Role findByName(RoleEnum role) throws ApiException {
        return repository.findByName(role).orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND, ApiMessageEnum.ROLE_NOT_FOUND));
    }
}
