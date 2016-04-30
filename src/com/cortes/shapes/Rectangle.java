/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cortes.shapes;

/**
 *
 * @author cl7admin
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;        
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateArea(){
        return this.length * this.width;
    }
    @Override
    public String toString(){
        return "The rectangle has " + this.length + " length and "  + this.width + " width " +
                " and an area of " + this.calculateArea();
    }
}
