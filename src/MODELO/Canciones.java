/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;


/**
 *
 * @author Usuario
 */
public class Canciones {
    Artistas artist;
    Genero gen;
    String chord;
    String nombre;
    int año;
    String letra;

    public Canciones(String nombre, int año, Artistas artist, Genero gen, String chord) {
        this.nombre = nombre;
        this.año = año;
        this.artist= artist;
        this.gen = gen;
        this.chord = chord;
    }

    public Artistas getArtist() {
        return artist;
    }

    public void setArtist(Artistas artist) {
        this.artist = artist;
    }

    public Genero getGen() {
        return gen;
    }

    public void setGen(Genero gen) {
        this.gen = gen;
    }

    public String getChord() {
        return chord;
    }

    public void setChord(String chord) {
        this.chord = chord;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }


    
    
    
}
