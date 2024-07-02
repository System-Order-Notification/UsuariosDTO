package br.com.sp.UsuarioDTOS.output;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.sp.UsuarioDTOS.auxiliary.UsuarioRoleDTO;

public class OutputUsuarioDTO {
	
	private UUID id;
	private String nome;
	private String email;
	private String senha;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataInicio;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataAlteracao;
	private Boolean enabled;
	private UsuarioRoleDTO role;
	
	public OutputUsuarioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public OutputUsuarioDTO(String nome, String email, String senha, LocalDate dataNascimento, LocalDateTime dataInicio,
			LocalDateTime dataAlteracao, Boolean enabled, UsuarioRoleDTO role) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.dataInicio = dataInicio;
		this.dataAlteracao = dataAlteracao;
		this.enabled = enabled;
		this.role = role;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public UsuarioRoleDTO getRole() {
		return role;
	}

	public void setRole(UsuarioRoleDTO role) {
		this.role = role;
	}
	
}
