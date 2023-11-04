package br.com.ramonsantos.servicocadastro.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ramonsantos.servicocadastro.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
