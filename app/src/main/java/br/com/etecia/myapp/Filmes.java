package br.com.etecia.myapp;

public class Filmes {
    private String titulo;

    private String categoria;

    private String descricao;

    private String rating;

    private int imgFilmes;

    public Filmes(String titulo, String categoria, String descricao, String rating, int imgFilmes) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.rating = rating;
        this.imgFilmes = imgFilmes;
    }
}
