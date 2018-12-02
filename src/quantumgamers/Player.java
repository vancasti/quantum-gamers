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
public class Player {
    private int id;
    private String name;
    private String surname;
    private double ingenuity;
    private double speed;
    protected double elo;

    public Player(int id, String name, String surname, double ingenuity, double speed) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.ingenuity = ingenuity;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(double ingenuity) {
        this.ingenuity = ingenuity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getElo() {
        return elo;
    }

    public void setElo(double elo) {
        this.elo = elo;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", ingenuity=" + ingenuity + ", speed=" + speed + ", elo=" + elo + '}';
    }
    
}
