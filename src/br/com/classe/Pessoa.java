/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classe;

import java.util.ArrayList;

/**
 *
 * @author Jean Heberth
 */
public class Pessoa {

    private String nome;
    private String dataAniversario;
    private Integer quantidadeFraldas;
    private String mimo;

    public Pessoa(String nome, String dataAniversario, Integer quantidadeFraldas, String mimo) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.quantidadeFraldas = quantidadeFraldas;
        this.mimo = mimo;
    }

    public Integer getQuantidadeFraldas() {
        return quantidadeFraldas;
    }

    public void setQuantidadeFraldas(Integer quantidadeFraldas) {
        this.quantidadeFraldas = quantidadeFraldas;
    }

    public String getMimo() {
        return mimo;
    }

    public void setMimo(String mimo) {
        this.mimo = mimo;
    }

    public Pessoa() {

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

    public void quantidadeFraldas() {

    }

}
