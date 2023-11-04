package br.com.ramonsantos.servicocadastro.domain.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@DynamicUpdate
@Data
@Entity
@Table(name = "t_user")
public class User {
	
	@Id
	@UuidGenerator
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "password")
	private String password;

}
