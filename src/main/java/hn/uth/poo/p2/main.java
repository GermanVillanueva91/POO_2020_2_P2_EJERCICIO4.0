/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2;

import hn.uth.poo.p2.objetos.Gallina;
import hn.uth.poo.p2.objetos.Gato;
import hn.uth.poo.p2.objetos.Hamster;
import hn.uth.poo.p2.objetos.Loro;
import hn.uth.poo.p2.objetos.Mantis;
import hn.uth.poo.p2.objetos.Perro;
import hn.uth.poo.p2.objetos.Serpiente;

/**
 *
 * @author Alexander
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Mascota mascota1 = new Mascota();
//        Como la clase mascota es abstracta no puedde instanciarse;
      Perro perro1= new Perro();
      Gato gato1 = new Gato();
      Loro loro1 = new Loro();
      Serpiente serpiente1 = new Serpiente();
      Hamster hamster1 = new Hamster();
      Mantis mantis1 = new Mantis();
      Gallina gallina1= new Gallina();
      
        System.out.println("El perro caminó: " + perro1.caminar(5));        
        System.out.println("El gato caminó: " + gato1.caminar(5));
        System.out.println("El loro caminó: " + loro1.caminar(5));
        System.out.println("La serpiente caminó: " + serpiente1.caminar(5));
        System.out.println("El hamster caminó: " + hamster1.caminar(5));
        System.out.println("La mantis caminó: " + mantis1.caminar(5));
        System.out.println("La gallina caminó: "+ gallina1.caminar(5));
    }
    
}
