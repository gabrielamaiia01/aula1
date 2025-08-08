package com.devsuperior.aula1.services;

import com.devsuperior.aula1.dto.UserDTO;
import com.devsuperior.aula1.entities.User;
import com.devsuperior.aula1.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findyByID(Long id){
       User entity = repository.findById(id).get();
       UserDTO dto = new UserDTO(entity);
       return dto;
    }

}
