/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pockergame;
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
        oMain.GetMessage();
    }
    
    private void GetMessage(){
        
        this.obj.FunctionInPlayer();
    }
}
