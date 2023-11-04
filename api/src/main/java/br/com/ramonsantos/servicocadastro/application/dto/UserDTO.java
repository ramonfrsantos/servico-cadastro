package br.com.ramonsantos.servicocadastro.application.dto;

import br.com.ramonsantos.servicocadastro.domain.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

	private String id;
	private String name;
	private String email;
	private String cpf;
	private String phone;
	private String password;

	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.cpf = user.getCpf();
		this.phone = user.getPhone();
		this.password = user.getPassword();
	}

}
