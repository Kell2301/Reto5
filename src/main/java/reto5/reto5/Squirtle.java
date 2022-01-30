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
public abstract class Squirtle extends Pokemon{
    
    private String nombre;
    private byte nivel;
    private int puntajeSalud;
    
    public Squirtle(String nombre, byte nivel, int puntajeSalud){
        
        this.nombre =nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
        
    }
    public Pokemon evolucionar() throws NoEvolucionaException {
        Wartortle wt = new Wartortle(this.nombre, this.nivel, this.puntajeSalud) {
        };
        System.out.println(wt.gritar());
        wt.evolucionar();
        return wt;

    }
    @Override
    public String gritar(){
        
        return "¡Squirtle!";
    
        }
}