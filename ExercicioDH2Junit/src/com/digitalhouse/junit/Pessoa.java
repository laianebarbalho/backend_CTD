package com.digitalhouse.junit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private LocalDate dataNasc;
    private String nome;
    private String sobrenome;

    List<String> colecao = new ArrayList<>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void adicionarNomes(Pessoa pessoa) {
        int tamanhoNome = pessoa.getNome().length();
        int idade = pessoa.converteIdade();

        if(tamanhoNome >= 5 && idade >= 18) {
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
    }

    public int converteIdade() {
        int idade = Period.between(this.dataNasc, LocalDate.now()).getYears();
        return idade;
    }

    public LocalDate getIdade() {
        return dataNasc;
    }

    public void setIdade(LocalDate idade) {
        this.dataNasc = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

}
