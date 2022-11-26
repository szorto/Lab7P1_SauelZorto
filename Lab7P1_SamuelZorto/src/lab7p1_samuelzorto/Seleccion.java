/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_samuelzorto;


public class Seleccion {
    public String grupo;
    public String NombSel;
    public String Director;
    public int Jugadores;
    public String Ganado;
    public String Posicion;
    public int Goles;

    
    

    public Seleccion(String grupo, String NombSel, String Director, int Jugadores, String Ganado, String Posicion, int Goles) {
        this.grupo = grupo;
        this.NombSel = NombSel;
        this.Director = Director;
        this.Jugadores = Jugadores;
        this.Ganado = Ganado;
        this.Posicion = Posicion;
        this.Goles = Goles;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombSel() {
        return NombSel;
    }

    public void setNombSel(String NombSel) {
        this.NombSel = NombSel;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getJugadores() {
        return Jugadores;
    }

    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
    }

    public String getGanado() {
        return Ganado;
    }

    public void setGanado(String Ganado) {
        this.Ganado = Ganado;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }
    
    

    
}
