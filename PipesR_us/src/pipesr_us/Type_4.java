/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.text.DecimalFormat;

/**
 *
 * @author Adecrown
 */
public class Type_4 extends Pipes{
    
    private double additionalCost;

    
    public Type_4(int grade, int quantity, double lenght,double outDiam, boolean chmRes) {
        super(grade, quantity, lenght, outDiam, chmRes);
       
        
        extraCost(); 
    }

    
     public void extraCost()
    {
        additionalCost = 1.00;
        
        if (this.chmRes) {
           additionalCost += 0.12;
        } 
         
        // this type only accept two colour
        additionalCost += 0.17; 
        
         // this type allows Inner insulation
        this.additionalCost += 0.14; 
    }
     
     
    // return the cost of the pipe
    @Override
    protected double pipeCost() {
        //System.out.println(this.volume);
        double cost =   Math.pow(this.volume, this.costPerGrade) * additionalCost;
        double convert = Double.parseDouble(new DecimalFormat("0.00").format(cost));
        return convert;
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
        int type = 4;
        return type;
    }
    
    
}
