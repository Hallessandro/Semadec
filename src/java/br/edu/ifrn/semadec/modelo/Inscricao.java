/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.semadec.modelo;

import java.io.Serializable;

/**
 *
 * @author Hallessandro
 */
public class Inscricao implements Serializable{
    private String nome;
    private String matricula;
    private String modalidade;

    public Inscricao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "Inscricao{" + "nome=" + nome + ", matricula=" + matricula + ", modalidade=" + modalidade + '}';
    }
    
}
