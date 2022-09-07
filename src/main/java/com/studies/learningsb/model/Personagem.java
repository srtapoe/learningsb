package com.studies.learningsb.model;

public class Personagem {

    private Long id;
    private String nome;
    private String serie;

    public Personagem(){}

    public Personagem(Long id, String nome, String serie) {
        this.id = id;
        this.nome = nome;
        this.serie = serie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
