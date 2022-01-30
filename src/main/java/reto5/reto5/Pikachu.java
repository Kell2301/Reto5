/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.reto5;

/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
  */
public abstract class Pikachu extends Pokemon {

    private String nombre;
    private byte nivel;
    private int puntajeSalud;

    public Pikachu(String nombre, byte nivel, int puntajeSalud) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;

    }

    public Pokemon evolucionar() throws NoEvolucionaException {
        Raichu rch = new Raichu(this.nombre, this.nivel, this.puntajeSalud) {
        };
        System.out.println(rch.gritar());
        rch.evolucionar();
        return rch;

    }

    @Override
    public String gritar() {

        return "¡Pikachu!";

    }

}
