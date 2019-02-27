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
public class Dados {

    private ArrayList<Pessoa> convidados = new ArrayList();

    public void cadastrarContatos(Pessoa pessoa) {
        this.convidados.add(pessoa);

    }

    public ArrayList<Pessoa> getConvidados() {
        return convidados;
    }

    public void setConvidados(ArrayList<Pessoa> convidados) {
        this.convidados = convidados;
    }

}
