/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

/**
 *
 * @author Adecrown
 */
public class Type_2 extends Pipes {
    
     private double additionalCost;

    
    public Type_2(int grade, int quantity, double lenght,double outDiam, boolean chmRes) {
        super(grade, quantity, lenght, outDiam, chmRes);
        this.additionalCost = 1.00;
        
        if (this.chmRes) {
            this.additionalCost += 0.12;
        } 
        
        // this type only accept one colour
        this.additionalCost += 0.12; 
    }

    
    // return the cost of the pipe
    @Override
    protected double pipeCost() {
        System.out.println(this.volume);
        double cost =   Math.pow(this.volume, this.costPerGrade) * additionalCost;
        return cost;
    }
    
    
    // returns the pipe cost * additional cost
    protected double totalCost2()
    {
        double tCost = (pipeCost()/100) * additionalCost; 
        double finalCost = pipeCost() * tCost;
        return finalCost;
    }
    
    
    // returns pipe type
    @Override
    protected int pipeType() {
        int type = 2;
        return type;
    }
    
}