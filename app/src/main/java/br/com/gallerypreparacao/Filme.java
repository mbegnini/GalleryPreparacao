package br.com.gallerypreparacao;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Filme implements Serializable {

    private String titulo;
    private String genero;
    private int ano;
    private Bitmap capa;

    public Filme(String titulo, String genero, int ano, Bitmap capa) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.capa = capa;
    }

    public Filme(){

    }

    public Bitmap getCapa() {
        return capa;
    }

    public void setCapa(Bitmap capa) {
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
