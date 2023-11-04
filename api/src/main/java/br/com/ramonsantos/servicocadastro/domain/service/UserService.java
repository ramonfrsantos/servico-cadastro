package br.com.ramonsantos.servicocadastro.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ramonsantos.servicocadastro.application.dto.UserDTO;
import br.com.ramonsantos.servicocadastro.domain.entity.User;
import br.com.ramonsantos.servicocadastro.infrastructure.config.CryptCustom;
import br.com.ramonsantos.servicocadastro.infrastructure.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		return repository.findAll().stream().map(UserDTO::new).toList();
	}

	public User insert(UserDTO dto) {
		return repository.save(toEntity(dto));
	}

	private User toEntity(UserDTO dto) {
		User user = new User();
		user.setCpf(dto.getCpf());
		user.setEmail(dto.getEmail());
		user.setName(dto.getName());
		user.setPhone(dto.getPhone());
		user.setPassword(CryptCustom.encrypt(dto.getPassword()));
		
		return user;
	}

	public User findById(String id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
	}

	public void update(String id, UserDTO dto) {
		User user = findById(id);
		
		user.setCpf(dto.getCpf());
		user.setEmail(dto.getEmail());
		user.setName(dto.getName());
		user.setPhone(dto.getPhone());
		user.setPassword(CryptCustom.encrypt(dto.getPassword()));
		
		repository.save(user);
	}
	
}
