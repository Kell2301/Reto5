/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.reto5;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 ***
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Pokebola {

    private String tamano;
    private Pokemon pokemon;
    private ArrayList<Pokemon> pokebola = new ArrayList<Pokemon>();

    public Pokebola() {
        
    }
    
    public String obtenerTamano(){
        int total= pokebola.size();
        String tamanoPokebola = "";
              
         switch (total) {
                case 1:                        
                    tamanoPokebola = "pequeña";  
                    break;                       
                case 2:                        
                    tamanoPokebola = "mediana";  
                    break;
                default:                        
                    tamanoPokebola = "grande";  
                    break;   
         }
         
         return tamanoPokebola;
    }

    public ArrayList<Pokemon> leerPokebola() {
         System.out.println("El tamaño de la pokebola es" + this.obtenerTamano());
         return pokebola;
    }

    public void guardar(Pokemon pokemon) {
        pokebola.add(pokemon);
    }

}
