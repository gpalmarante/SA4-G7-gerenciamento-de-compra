package com.mycompany.sa4.Enums;

public enum ProdutosTipos {
	EleCozinha("Eletros Cozinha"),
	EleSala("Eletros Sala"),
	EleBranca("Eletros Linha Branca"),
	MovCozinha("Moveis Cozinha"),
	MovSala("Moveis Sala"),
	MovQuartos("Moveis Quartos");

	
	final String ProdutosTipos;

	ProdutosTipos(String ProdutosTipos) {
        this.ProdutosTipos = ProdutosTipos;
    }

    public String getProdutosTipos() {
        return ProdutosTipos;
    }
}