/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto5.reto5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import reto5.reto5.Charizard;
import reto5.reto5.Charmander;
import reto5.reto5.Charmeleon;
import reto5.reto5.Pikachu;
import reto5.reto5.Squirtle;
import java.util.InputMismatchException;

/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Principal {

    public static Pokebola pk = new Pokebola();

    public static void main(String[] args) throws NoEvolucionaException {

        try {
            int opcion = 0;
            byte level = 100;
            Scanner leer = new Scanner(System.in);
            boolean sw = true;

            while (sw) {

                System.out.println("\n\n Seleccione un pokemon:\n" + "1) Pikachu\n" + "2) Charizard\n"
                        + "3) Charmeleon\n" + "4) Charmander \n" + "5) Squirtle\n" + "6) Raichu\n"
                        + "7) Wartortle\n" + "8) Blastoise\n" + "9) Salir\n");

                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        Pikachu p = new Pikachu("Pikachu", level, 10) {
                        };
                        System.out.println(p.gritar());
                        pk.guardar(p);
                        pk.guardar(p.evolucionar());
                        break;
                    case 2:
                        Charizard cd = new Charizard("Charizard", level, 10) {
                        };                        
                        System.out.println(cd.gritar());
                        pk.guardar(cd);
                        pk.guardar(cd.evolucionar());
                        break;
                    case 3:
                        Charmeleon cn = new Charmeleon("Charmeleon", level, 10) {
                        };
                        System.out.println(cn.gritar());
                        pk.guardar(cn);
                        pk.guardar(cn.evolucionar());
                        break;
                    case 4:
                        Charmander cr = new Charmander("Charmander", level, 10) {
                        };
                        System.out.println(cr.gritar());
                        pk.guardar(cr);
                        pk.guardar(cr.evolucionar());
                        break;
                    case 5:
                        Squirtle sq = new Squirtle("Squirtle", level, 10) {
                        };
                        System.out.println(sq.gritar());
                        pk.guardar(sq);
                        pk.guardar(sq.evolucionar());
                       
                        break;
                    case 6:
                        Raichu rh = new Raichu("Raichu", level, 10) {
                        };                        
                        System.out.println(rh.gritar());
                        pk.guardar(rh);
                        pk.guardar(rh.evolucionar());
                       
                        break;
                    case 7:
                        Wartortle wt = new Wartortle("Wartortle", level, 10) {
                        };
                        System.out.println(wt.gritar());
                        pk.guardar(wt);
                        pk.guardar(wt.evolucionar());
                        break;

                    case 8:
                        Blastoise bs = new Blastoise("Blastoise", level, 10) {
                        };
                        System.out.println(bs.gritar());
                        pk.guardar(bs);
                        pk.guardar(bs.evolucionar());
                        break;

                    case 9:
                        System.out.println("Finalizado");
                        sw = false;
                        break;
                }
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }

    }

}
