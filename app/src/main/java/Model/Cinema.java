package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by meucomputador on 12/06/17.
 */

public class Cinema implements Serializable{

    private String nome;
    private ArrayList<Filme> filmes;
    private double latitude;
    private double longitude;

    public Cinema(ArrayList<Filme> filmes, double longitude, double latitude, String nome) {
        this.filmes = filmes;
        this.longitude = longitude;
        this.latitude = latitude;
        this.nome = nome;
    }


    public void adicionaFilme(Filme f) {
        filmes.add(f);
    }
    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = nome;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String toString() {
        return this.nome;
    }
}
