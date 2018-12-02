/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumgamers;

/**
 *
 * @author victorcastineiragarcia
 */
public final class Carry extends Player {

    public Carry(int id, String name, String surname, Double ingenuity, Double speed) {
        super(id, name, surname, ingenuity, speed);
        this.elo = this.generateELO();
    }

   
    public Double generateELO() {
        return this.getSpeed() * 2 + this.getIngenuity() * 0.5;
    }
    
}
