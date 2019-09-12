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
public class PlayerClass {
    //public CardClass hand [];
    public String name;
    public int chips;
    
    public PlayerClass(){}
    public PlayerClass(String pName){
        this.name = pName;
    }
    public void FunctionInPlayer(){
        System.out.println("This functions is inside PlayerClass");
    } 
    
}
