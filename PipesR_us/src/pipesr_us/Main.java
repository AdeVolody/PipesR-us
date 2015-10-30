/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

/**
 *
 * @author up720163
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
       
        
        
        
        
       //Testing Basket and Orders Class
                
        // Creating new basket.
        Basket basket1 = new Basket("Basket");

        // Creating the orders.
        Orders order1 = new Orders();
        

        // Creating the pipe.
        Pipes pig = new Type_2(1, 2, 2, 6, true);
        Pipes pier = new Type_5(1,1,3,1,true);
       
        // Adding pipe to the orders.
        order1.addPipe(pig);
        order1.addPipe(pier);
        

        // Adding orders to the basket.
        basket1.addOrder(order1);
        

        // Output information regarding the order.
       basket1.outputOrders();
    }
    
}
