/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.reto5;

/**
 *
 * /**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public abstract class Wartortle extends Pokemon {
    private String nombre;
    private byte nivel;
    private int puntajeSalud;

    public Wartortle(String nombre, byte nivel, int puntajeSalud) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;

    }
    
    public Pokemon evolucionar() throws NoEvolucionaException {
        Blastoise bs = new Blastoise(this.nombre, this.nivel, this.puntajeSalud) {
        };
        System.out.println(bs.gritar());
        bs.evolucionar();
        return bs;

    }

    @Override
    public String gritar() {

        return "¡Wartortle!";

    }
    
}
