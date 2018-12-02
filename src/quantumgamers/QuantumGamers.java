/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumgamers;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author victorcastineiragarcia
 */
public class QuantumGamers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Team> teams = new ArrayList<>();
        Random rand = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=1; i<=100; i++){
            // Generates random Strings for players & teams
            String randomName = new Random().ints(8, 0, chars.length())
                    .mapToObj(j -> "" + chars.charAt(j))
                    .collect(Collectors.joining());
            
            String randomSurname = new Random().ints(8, 0, chars.length())
                    .mapToObj(j -> "" + chars.charAt(j))
                    .collect(Collectors.joining());
            
            Double randomIngenuity = rand.nextDouble();
            Double randomSpeed = rand.nextDouble();
            
            if (i % 2 == 0)
                players.add(new Carry(i, randomName, randomSurname, randomIngenuity, randomSpeed));
            else 
                players.add(new Coach(i, randomName, randomSurname, randomIngenuity, randomSpeed));
            
            // A team is formed by 5 players
            if (i % 5 == 0) {
                teams.add(new Team(i / 5,randomName, players));
                players = new ArrayList<>();
            }
        }
        
        // executing pairing algorithm
        PairingAlgorithm algo = new PairingAlgorithm(teams);
        algo.execute(args);
    }
    
}
