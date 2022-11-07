package com.digitalhouse.junit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private LocalDate dataNasc;
    private String nome;
    private String sobrenome;

    static List<String> colecao = new ArrayList<>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void adicionarNomes(Pessoa pessoa){
        int nomeTamanho = pessoa.getNome().length();
        int idade = pessoa.convertIdade();
        if (nomeTamanho >= 5 && idade >= 18){
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
    }

    public int convertIdade(){
        int idade = Period.between(this.dataNasc, LocalDate.now()).getYears();
        return idade;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + this.convertIdade() +
                '}';
    }

    public boolean returnTrue(){

        return ((2+2) == 4);
    }
}
