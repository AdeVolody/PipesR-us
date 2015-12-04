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
public class Type_3 extends Pipes{
    
    private double additionalCost;

    
    public Type_3(int grade, int quantity, double lenght,double outDiam, boolean chmRes, int colours,boolean insulation,boolean reinforcement) {
        super(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);
        
        
    }
    
    // returns pipe type
    @Override
    protected int pipeType() {
        int type = 3;
        return type;
    }
    
}
