/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.text.DecimalFormat;

/**
 *
 * @author up720163 & Up739558
 */
public abstract class Pipes {

    protected int grade, quantity,colours;
    protected double lenght, outDiam,costPerGrade;
    protected boolean chmRes, insulation, reinforcement;
    

    public Pipes(int grade, int quantity, double lenght,
            double outDiam, boolean chmRes,int colours,boolean insulation,boolean reinforcement) {
        this.grade = grade;
        this.quantity = quantity;
        this.lenght = lenght;
        this.outDiam = outDiam;
        this.chmRes = chmRes;
        this.colours = colours;
        this.insulation = insulation;
        this.reinforcement = reinforcement;
        costPerGrade = gradeCost(grade);
        
       
    }

    
    /**
     * This method Works out the overall cost of the Pipe. 
     * Cost of pipe * quantity = formatted to two decimal places.
     */
    protected double totalCost() {
        double finalCost = pipeCost() * getQuantity();
        double convert = Double.parseDouble(new DecimalFormat("0.00").format(finalCost));
        return convert;
    }


    
    //Work out cost % for the specified grade. Cost of 1 cubic inch of plastic by grade
    private double gradeCost(int grade) {
        double cost = 0.0;
        switch (grade) {
            case 1:
                cost = 0.3; // Grade 1.
                break;
            case 2:
                cost = 0.32; // Grade 2.
                break;
            case 3:
                cost = 0.35; // Grade 3.
                break;
            case 4:
                cost = 0.40; // Grade 4.
                break;
            case 5:
                cost = 0.46; // Grade 5.
                break;
        }
        return cost;
    }

    // returns the cost
    public double pipeCost(){
        double innDiam = 0.9*outDiam;
        double length = getLengthMeter()/0.0254;
        double innVolume = Math.PI * Math.pow(innDiam/2,2)*length;
        double outVolume = Math.PI * Math.pow(outDiam/2,2)*length;
        double pipeVolume = (outVolume - innVolume);
        
        double cost = pipeVolume*gradeCost(getGrade());
        double addCost = additionalCost();
        cost *= (1+addCost);
        return cost;
    }
    
    private double additionalCost(){
        double addCost = 0.0;
        if (colours>0){
            if (colours==1){
                addCost+=0.12;
            }
            if(colours==2){
                addCost+=0.17;
            }
        }
        if(chmRes==true){
            addCost+=0.12;
        }
        if(insulation==true){
            addCost+=0.14;
        }
        if(reinforcement==true){
            addCost+=0.15;
        }
        addCost = Double.parseDouble(new DecimalFormat("0.00").format(addCost));
        return addCost;
    }
    
    //Returns the type of pipe
    abstract protected int pipeType();

    
    // Getters and Setters
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public int getColours(){
        return colours;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLenght() {
        double inches = 39.37 * lenght;
        return inches;
    }
    
    public double getLengthMeter(){
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getOutDiam() {
        return outDiam;
    }

    public void setOutDiam(double outDiam) {
        this.outDiam = outDiam;
    }

    public boolean getChmRes() {
        return chmRes;
    }
    public boolean getInsulation() {
        return insulation;
    }
    public boolean getReinforcement() {
        return reinforcement;
    }
    public void setChmRes(boolean chmRes) {
        this.chmRes = chmRes;
    }

    

}
