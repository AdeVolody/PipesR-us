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

   
    
     public void removeOrder(int index)
    {
        pipes.remove(index);
    }
    
    //Returns the total price of the order.
    public double getTotal(ArrayList<Pipes> oPipes) {
        double total = 0.0;
        for(int i = 0; i<oPipes.size();i++){
            total = total + oPipes.get(i).totalCost();
        }
        return total;
    }

    //Returns a list of pipes in the Order.
    public String pipesOrderd() {
        String pipeList="";
        
        
        for(Pipes pipe : pipes){
            pipeList += "<Type "+pipe.pipeType()+"(x"+pipe.getQuantity()+")> ";
        }
        return pipeList;
    }
    
    
    
public void pipeInfo(){
        int i=1;
        double volume =0.0;
        double cost=0.0;
        for(Pipes b : pipes){
            System.out.println("Pipe "+i+ " quantity: "+b.quantity);

            volume=Double.parseDouble(new DecimalFormat("#.##").format(b.volume));
            System.out.println("\tVolume: "+volume);

            cost=Double.parseDouble(new DecimalFormat("#.##").format(b.pipeCost()));
            System.out.println("\tCost per pipe: £"+cost);

            System.out.println("\tTotal cost: £"+b.totalCost());

            i++;
        } System.out.println();
    }
    

    
    // Returns amount of pipes.
    public int amount() {
        return 0;
    } 
}
