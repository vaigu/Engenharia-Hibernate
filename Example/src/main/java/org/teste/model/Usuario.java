package main.java.org.teste.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GenericGenerator(name = "generator_usuario", strategy = "native", parameters = @Parameter(name = "sequence", value = "usuario_id"))
	@GeneratedValue(generator = "generator_usuario")
	private Long idUsuario;
	
	@Column(length=150)
	private String email;
	
	@Column(length=50)
	private String login;
	
	@Column(length=100)
	private String nome;
	
	@Column(length=50)
	private String senha;
	
	@Column(length=50)
	private String sobrenome;
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
