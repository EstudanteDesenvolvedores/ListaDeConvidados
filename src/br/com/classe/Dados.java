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

    ArrayList<Pessoa> convidados = new ArrayList();

    public void cadastrarContatos(Pessoa pessoa) {
        this.convidados.add(pessoa);

    }
}
