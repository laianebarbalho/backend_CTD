package com.dh.model;

public class Filiais {
    private int id, numero;
    private String nome, rua, cidade, estado;
    private Boolean is5Estrelas;

    //Construtores
    public Filiais(int id, int numero, String nome, String rua, String cidade, String estado, Boolean is5Estrelas) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.is5Estrelas = is5Estrelas;
    }



    //Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getIs5Estrelas() {
        return is5Estrelas;
    }

    public void setIs5Estrelas(Boolean is5Estrelas) {
        this.is5Estrelas = is5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", is5Estrelas=" + is5Estrelas +
                '}';
    }
}
