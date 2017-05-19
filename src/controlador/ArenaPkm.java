/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Pokemon;

/**
 * Implementar esta clase
 * @author Coloque aqui sus datos
 */
public class ArenaPkm {
    //Pokemon de la computadora
    Pokemon picachu;
    //Pokemon del Jugador
    Pokemon bulvasaur;

    /**
     * Crea una nueva batalla pokemon con los pokemon dados
     * @param picachu el pokemon que usará la computadora
     * @param bulvasaur el pokemon que usará el jugador
     */
    public ArenaPkm(Pokemon picachu, Pokemon bulvasaur) {
        this.picachu = picachu;
        this.bulvasaur = bulvasaur;
    }
    
    /**
     * Permite atacar utilizando uno de los 4 ataques del pokemon
     * @param seleccion el ataque a utilizar entre 1 y 4
     * @return mensaje con la accion tomada por la computadora, 
     * o mensaje de victoria si se derrota al oponente
     */
    public String atacar(int seleccion){
        throw new UnsupportedOperationException("No esta soportado");
    }
    
    
}
