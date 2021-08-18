/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4.Model;

import com.mycompany.sa4.Enums.UsuarioGenero;

/**
 *
 * @author gpalmarante
 */
public class Usuario {
    
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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the SobreNome
     */
    public String getSobreNome() {
        return SobreNome;
    }

    /**
     * @param SobreNome the SobreNome to set
     */
    public void setSobreNome(String SobreNome) {
        this.SobreNome = SobreNome;
    }

    /**
     * @return the Sexo
     */
    public UsuarioGenero getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(UsuarioGenero sexo) {
        this.Sexo = sexo;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the DataNacimento
     */
    public String getDataNacimento() {
        return DataNacimento;
    }
    /**
     * @param DataNacimento the DataNacimento to set
     */
    public void setDataNacimento(String DataNacimento) {
        this.DataNacimento = DataNacimento;
    }
    public enum Genero{
    	Masculino,
    	Feminino,
    	outros
    	
    }
    private int Id;
    private String Nome;
    private String SobreNome;
    private UsuarioGenero Sexo;
    private String Usuario;
    private String Senha;
    private String DataNacimento;
    
}
