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
public class Customer {
    
    private String email;
    private Boolean firstRent;

    public Customer(){
        
    }
    
    public Customer(String email, Boolean firstRent){
            this.email = email;
            this.firstRent = firstRent;
    }
}
