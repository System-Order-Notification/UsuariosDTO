package br.com.sp.UsuarioDTOS.auxiliary;

public enum UsuarioRoleDTO {
	ADMIN(1, "Admin"),
	USER(2, "Usuário");
	
	private Integer id;
	private String name;
	
	private UsuarioRoleDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
