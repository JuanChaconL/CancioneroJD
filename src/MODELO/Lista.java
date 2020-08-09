/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lista {

  public static ArrayList<Canciones> listaCanciones= new ArrayList<Canciones>();
  public static ArrayList<Genero> listaGeneros= new ArrayList<Genero>(); 
  public static ArrayList<Artistas> listaArtistas= new ArrayList<Artistas>(); 
  private int pos;
  
      //MANTENIMIENTO Canciones
    public void agregarCanciones(String nombre, int año,  Artistas art, Genero gen, String chord) {
        Canciones can1 = new Canciones(nombre, año, art, gen, chord);
        listaCanciones.add(can1);
    }

    public void agregarCanciones(Canciones can1) {
        listaCanciones.add(can1);
    }

    public Canciones obtenerCanciones(int pos) {
        return listaCanciones.get(pos);
    }

    public int BuscarCanciones(String nombre) {
        int encontro = -1;
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontro = i;
            }
        }

        return encontro;
    }

    public void actualizarCanciones(String nombre, int año,  Artistas art, Genero gen, String chord) {
        Canciones can1 = new Canciones(nombre, año, art, gen, chord);
        listaCanciones.set(pos, can1);
    }

    public int TamListaOficinas() {
        return listaCanciones.size();
    }

    public void eliminarOficinas(int Id) {

        listaCanciones.remove(Id);

    }
    
    
    
}
