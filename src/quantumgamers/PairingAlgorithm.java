/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumgamers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author victorcastineiragarcia
 */
public class PairingAlgorithm {
    private ArrayList<Team> teams;
    private ArrayList<Player> players;
    private Map<Integer, Integer> pairs;
    
    public PairingAlgorithm(ArrayList<Team> teams) {
        this.teams = teams;
        this.players = new ArrayList<>();
        this.pairs = new HashMap();
    }
    
    public void showPairingTeams() {
        System.out.println("Teams paired by id:");
        
        for(int i = 0;i < 20; i+=2) {
            pairs.put(this.teams.get(i).getId(), this.teams.get(i+1).getId());
        }
        
        Set<Entry<Integer,Integer>> hashSet=pairs.entrySet();
        
        hashSet.forEach((entry) -> {
            System.out.println("TeamA="+entry.getKey()+", TeamB="+entry.getValue());
        });
    }
    
    public void showFiveBestPlayers() {
        System.out.println("Best 5 Players:");
        teams.forEach((team) -> {
            ArrayList<Player> teamPlayers = team.getPlayers();
            teamPlayers.forEach((player) -> {
                players.add(player);
            });
        });
        
        players.sort(Comparator.comparingDouble(Player::getElo).reversed());
        for(int i = 0;i < 5; i++) {
            System.out.println(this.players.get(i).toString());
        }
    }
    
    public void showFiveBestTeams() {
        System.out.println("Best 5 Teams:");
        for(int i = 0;i < 5; i++) {
            System.out.println(this.teams.get(i).toString());
        }
    }
    
    public void execute(String[] args) {
        
        System.out.println("Teams initialiced:");
        this.teams.forEach(System.out::println);
       
        teams.sort(Comparator.comparingDouble(Team::getAverageScore).reversed());
        
        System.out.println("Sorted Teams by Score:");
        this.teams.forEach(System.out::println);
        
        this.showPairingTeams();
        this.showFiveBestPlayers();
        this.showFiveBestTeams();
    }
    
}
