/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author up720163
 */



public class Orders {

    private ArrayList<Pipes> pipes = new ArrayList<>();

    public Orders(){
        
    }
    public Orders(ArrayList<Pipes> oPipes) {
       pipes = oPipes;
    }

    //Adds specified pipe to ArrayList<Pipes>.
    public void addPipe(Pipes pName) {
        pipes.add(pName);
    }

    //Empty the Pipe array.
    public void empty() {
        pipes.clear();
    }

    //Returns the total price of the order.
    public double getTotal(ArrayList<Pipes> oPipes) {
        double total = 0.0;
        for(int i = 0; i<oPipes.size();i++){
            total = total + oPipes.get(i).pipeCost();
        }
        return total;
    }

    //Returns a list of pipes in the Order.
    public ArrayList<Pipes> pipesOrderd() {
        return pipes;
    }

    /**
     * System Out puts all information about each pipe in the order. including
     * the area, cost and total cost.
     */
    public void outputBoxes() {

    }

    // Accessor & Mutator methods.
    // Returns amount of pipes.
    public int amount() {
        return 0;
    } 
}
