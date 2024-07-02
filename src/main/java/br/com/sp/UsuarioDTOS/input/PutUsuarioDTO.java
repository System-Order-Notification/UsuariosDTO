package br.com.sp.UsuarioDTOS.input;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PutUsuarioDTO {
	@NotBlank(message = "O nome não pode ser vazio ou nulo")
	private String nome;
	
	@Email
	@NotBlank(message = "O email não pode ser vazio ou nulo")
	private String email;
	
	@NotBlank(message = "A senha não pode ser vazio ou nulo")
	private String senha;
	
	@NotNull(message = "Data de Nascimento não pode ser nulo")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	public PutUsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public PutUsuarioDTO(String nome, String email, String senha, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
