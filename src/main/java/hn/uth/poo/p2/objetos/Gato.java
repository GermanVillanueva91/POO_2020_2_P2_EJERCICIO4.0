/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2.objetos;

/**
 *
 * @author Alexander
 */
public class Gato extends Mascota {

    @Override
    public int caminar(int distancia) {
        return distancia*3;
    }
    
}
