package com.mycompany.sa4.Enums;

public enum UsuarioGenero {
	MASCULINO("Masculino")
	,FEMININO("Feminnino")
	,OUTRO("outros");
	
	final String UsuarioGenero;

	UsuarioGenero(String UsuarioGenero) {
        this.UsuarioGenero = UsuarioGenero;
    }

    public String getUsuarioGenero() {
        return UsuarioGenero;
    }
}
