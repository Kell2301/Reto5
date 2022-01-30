/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.reto5;

import reto5.reto5.NoEvolucionaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public abstract class Charizard extends Pokemon {

    private String nombre;
    private byte nivel;
    private int puntajeSalud;

    public Charizard(String nombre, byte nivel, int puntajeSalud) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;

    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "¡Charizard!";
    }

}
