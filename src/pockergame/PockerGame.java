/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pockergame;
import java.util.*;
/**
 *
 * @author ciprianofr
 */
public class PockerGame {

    /**
     * @param args the command line arguments
     */
    //instance
    PlayerClass obj = new PlayerClass();
    CardClass objCard = new CardClass();
    
    public static void main(String[] args) {
        // TODO code application logic
        PockerGame oMain = new PockerGame();
        oMain.NewGame(5,10);
    }
    
    private void NewGame(int numOfPlayers,int initAnte){
        ArrayList<PlayerClass> players = new ArrayList<PlayerClass>();
        
        for(int i=0;i<numOfPlayers;i++){
            players.add(new PlayerClass("Player" + (i+1)));
        }
        
        
    }
    
    private void GetMessage(){
        
        this.obj.FunctionInPlayer();
    }
}
