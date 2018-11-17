/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classe;

/**
 *
 * @author Jean Heberth
 */
public class Pessoa {
    
    
    private String nome;
    private String dataAniversario;

    public Pessoa(String nome, String dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
    public void quantidadeFraldas(){
        
    }
    
    
}
