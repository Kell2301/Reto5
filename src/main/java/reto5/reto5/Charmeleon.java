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
public abstract class Charmeleon extends Pokemon {

    private String nombre;
    private byte nivel;
    private int puntajeSalud;

    public Charmeleon(String nombre, byte nivel, int puntajeSalud) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;

    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        Charizard cd = new Charizard(this.nombre, this.nivel, this.puntajeSalud) {
        };

        System.out.println(cd.gritar());
        cd.evolucionar();
        return cd;

    }

    @Override
    public String gritar() {

        return "¡Charmeleon!";

    }
}
