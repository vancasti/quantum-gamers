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
public final class Coach extends Player {
    
    public Coach(int id, String name, String surname, double ingenuity, double speed) {
        super(id, name, surname, ingenuity, speed);
        this.elo = this.generateELO();
    }
    
    public double generateELO() {
        return this.getSpeed() * 0.2 + this.getIngenuity() * 3;
    }
    
}
