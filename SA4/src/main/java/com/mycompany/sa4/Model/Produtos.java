/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4.Model;

/**
 *
 * @author gpalmarante
 */
public class Produtos {
			private int Id;
			private String Modelo;
			private String Marca;
			private String Tipo;
	    
			private int QtdComprada;
			private int QtdStoque;
	    	private int QtdVendidas;
	    
	    	private int ValorCompra;
	    	private int ValorVenda;
	    
	    
	public int getQtdStoque() {
			return QtdStoque;
		}

	public void setQtdStoque(int qtdStoque) {
			QtdStoque = qtdStoque;
		}

	public int getQtdVendidas() {
			return QtdVendidas;
		}

	public void setQtdVendidas(int qtdVendidas) {
			QtdVendidas = qtdVendidas;
		}

	public int getValorCompra() {
			return ValorCompra;
		}

	public void setValorCompra(int valorCompra) {
			ValorCompra = valorCompra;
		}

	public int getValorVenda() {
			return ValorVenda;
		}

	public void setValorVenda(int valorVenda) {
			ValorVenda = valorVenda;
		}

	public void setQtdComprada(int qtdComprada) {
			QtdComprada = qtdComprada;
		}

	/**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the QtdComprada
     */
    public int getQtdComprada() {
        return QtdComprada;
    }

      
}
