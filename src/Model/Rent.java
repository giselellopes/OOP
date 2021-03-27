/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Home
 */
public class Rent {
    
    private int dateRent;
    int dateReturn;
    private int dateNextBill;
    private double totalPrice;
    
    public Rent(){
        
    }
    
    public Rent(int dateRent, int dateReturn, int dateNextBill, double totalPrice){
        this.dateRent = dateRent;
        this.dateReturn = dateReturn;
        this.dateNextBill = dateNextBill;
        this.totalPrice = totalPrice;
    }
    
}
