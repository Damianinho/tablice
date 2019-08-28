package com.example.ddami.tablice.Models;

/**
 * Created by ddami on 26.11.2017.
 */

public class Tablice {
    int id,indeks,identyfikator
    String nazwa_uslugi;
    double rodzaj_uslugi;

    public Tablicd(){

    }
    public Tablice(int indeks, String nazwa_uslugi, double rodzaj_uslugi, int identyfikator) {
        this.indeks = indeks;
        this.nazwa_uslugi = nazwa_uslugi;
        this.rodzaj_uslugi = rodzaj_uslugi;
        this.identyfikator = identyfikator;

    }

    public Matches(int id, nt indeks, String nazwa_uslugi, double rodzaj_uslugi, int identyfikator) {
        this.id = id;
        this.indeks = indeks;
        this.nazwa_uslugi = nazwa_uslugi;
        this.rodzaj_uslugi = rodzaj_uslugi;
        this.identyfikator = identyfikator;

    }

    public void setId(int id) {
        this.id = id;
    }
    public long getId() {
        return this.id;
    }
    public void setIndeks(int indeks){
        this.indeks = indeks;
    }
    public long getIndeks(){
        return this.indeks;
    }
    public void setNazwa_uslugi(String nazwa_uslugi){
        this.nazwa_uslugi = nazwa_uslugi;
    }
    public String getNazwa_uslugi(){
        return this.nazwa_uslugi;
    }
    public double set_rodzaj_uslugi(float rodzaj_uslugi){
        this.rodzaj_uslugi = rodzaj_uslugi;
    }
    public float getRodzaj_uslugi(){
        return this.rodzaj_uslugi;
    }
    public void setIdentyfikator(int identyfikator){
        this.identyfikator = identyfikator;
    }
    public float getIdentyfikator(){
        return this.identyfikator;
    }

}
