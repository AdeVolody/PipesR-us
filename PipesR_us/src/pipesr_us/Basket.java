/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.util.ArrayList;

/**
 *
 * @author up720163 & Up739558
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

     public void removeOrder(int index)
    {
        orders.remove(index);
    }
    
     //Adds specified order to ArrayList<Order>.
    public void addOrder(Orders orders) {
        this.orders.add(orders);
    }

    public void outputOrders(){
        int i=1;
        for(Orders o : orders){
            System.out.println("Order"+i+": ");
            o.pipeInfo();

            i++;
        }
    }

    // Accessor and Mutator methods.
    //return Basket name
    public String getName() {
        return name;
    } 

    
    // Returns amount of Orders.
    public int amount() {
        return orders.size();
    } 

}
