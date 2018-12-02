/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumgamers;

import java.util.ArrayList;

/**
 *
 * @author victorcastineiragarcia
 */
public class Team {
    private int id;
    private String name;
    private ArrayList<Player> players;
    private double averageScore;

    public Team(int id, String name, ArrayList<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
        this.averageScore = this.generateAverageScore();
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

    public ArrayList<Player> getPlayers() {
            return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + ", players=" + players + ", averageScore=" + averageScore + '}';
    }
    
    public double generateAverageScore() {
        double score = 0.0;
        for (Player player : players) {
            score += player.getElo();
        }
        return score / 5;
    }

    public double getAverageScore() {
        return averageScore;
    }
    
}
