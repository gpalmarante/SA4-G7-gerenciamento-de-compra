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
	    	
	    	
	    	public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			public String getModelo() {
				return Modelo;
			}
			public void setModelo(String modelo) {
				Modelo = modelo;
			}
			public String getMarca() {
				return Marca;
			}
			public void setMarca(String marca) {
				Marca = marca;
			}
			public String getTipo() {
				return Tipo;
			}
			public void setTipo(String tipo) {
				Tipo = tipo;
			}
			public int getQtdComprada() {
				return QtdComprada;
			}
			public void setQtdComprada(int qtdComprada) {
				QtdComprada = qtdComprada;
			}
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
			
	    
      
}
