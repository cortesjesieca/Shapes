/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cortes.shapes;

/**Class Circle asks the radius and calculate the area  
 * display the radius and area of the Circle
 * 
 */
public class Circle {
    //attributes
    private int numOfSides;
    private double radius;

    public Circle() {
        this.numOfSides = 0;
        this.radius = 0.0f;
    }

    public Circle(double r) {
        this.numOfSides = 0;
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI * (this.radius * this.radius);
    }
    @Override
    public String toString(){
        return "The Circle has " + this.radius + " radius and " + this.calculateArea()+ " area"; 
    }
    
    
            
   
}
