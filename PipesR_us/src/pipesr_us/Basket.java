/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.util.ArrayList;

/**
 *
 * @author up720163
 */
public class Basket {

    private final String name; // basket name
    protected ArrayList<Orders> orders = new ArrayList<>(); // Array of Orders.

    
    // First Consctructor 
    public Basket() {
        this.name = "PipesR-Us";
    }

    //Second Constructor 
    public Basket(String name) {
        
        this.name = name;
    }

    
     //Adds specified order to ArrayList<Order>.
    public void addOrder(Orders orders) {
        
    }

    
    //Outputs information regarding each order stored in the basket.
    public void ordersPlaced() {
        
    }

    // Accessor and Mutator methods.
    //return Basket name
    public String getName() {
        
        return null;
    } 

    
    // Returns amount of Orders.
    public int amount() {
        return 0;
    } 

}
