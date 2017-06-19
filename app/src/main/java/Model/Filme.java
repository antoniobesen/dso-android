package Model;

import java.io.Serializable;

/**
 * Created by meucomputador on 12/06/17.
 */

public class Filme implements Serializable{

    private String titulo;
    private String tituloOriginal;
    private String nomeDiretor;
    private String elenco;
    private String sinopse;
    private int duracao;
    private String sessoes;

    public Filme(String tituloOriginal,String titulo, String nomeDiretor, String elenco, String sinopse, int duracao, String sessoes) {
        this.titulo = titulo;
        this.nomeDiretor = nomeDiretor;
        this.elenco = elenco;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.sessoes = sessoes;
        this.tituloOriginal = tituloOriginal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getSessoes() {
        return sessoes;
    }

    public void setSessoes(String sessoes) {
        this.sessoes = sessoes;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String toString() {
        return this.titulo;
    }
}
