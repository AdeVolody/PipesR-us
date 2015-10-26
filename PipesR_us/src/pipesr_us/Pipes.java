/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.text.DecimalFormat;

/**
 *
 * @author up720163
 */
public abstract class Pipes {

    protected int grade, quantity;
    protected double lenght, outDiam;
    protected boolean chmRes, insulation, reinforcement;
    protected double costPerGrade,volume;

    public Pipes(int grade, int quantity, double lenght,
            double outDiam, boolean chmRes) {
        this.grade = grade;
        this.quantity = quantity;
        this.lenght = lenght;
        this.outDiam = outDiam;
        this.chmRes = chmRes;
        
        this.volume = volume();
        costPerGrade = gradeCost(grade);
    }

    // returns the cost
    abstract protected double pipeCost();
    
    
    //Returns the type of pipe
    abstract protected int pipeType();

    /**
     * This method Works out the overall cost of the Pipe. Cost of pipe *
     * quantity.
     *
     * @return convert - total cost of pipes, formatted to two decimal places.
     */
    protected double totalCost() {
        double finalCost = pipeCost() * getQuantity();
        double convert = Double.parseDouble(new DecimalFormat("0.00").format(finalCost));
        return convert;
    }

    /**
     * This Works out the volume  of Pipe.
     *
     * @return pipeVolume - Pipes Volume.
     */
    private double volume() {

        double pipeVolume = 0.0;
        pipeVolume += Math.PI * ((getOutDiam() / 100) * 90) * getLenght(); //volume of the pipe’s material
        return pipeVolume;
    }

    /**
     * Work out cost % for the specified grade. Cost of 1 cubic inch of plastic
     * by grade.
     *
     * @return cost - grade cost.
     */
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
                cost = 1.46; // Grade 5.
                break;
        }
        return cost;
    }

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLenght() {
        double inches = 39.37 * lenght;
        return inches;
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

    public boolean isChmRes() {
        return chmRes;
    }

    public void setChmRes(boolean chmRes) {
        this.chmRes = chmRes;
    }

    

}
