/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cortes.main;

import com.cortes.shapes.*;
import java.util.Scanner;

/**
 *
 * @author cl7admin
 */
public class MainClass {
    public static void main(String[] args) {
        double r, l, w;
        int menu = 0;
        Scanner scan = new Scanner(System.in);
        while(menu != 3){
            System.out.println("________MENU________");
            System.out.println("1--Circle");
            System.out.println("2--Rectangle");
            System.out.println("3--Exit");
            System.out.println("_____END MENU_______");
            System.out.println("Please select a number from the menu");
            menu = scan.nextInt();
            switch(menu){
                
                case 1:
                    System.out.print("Please enter radius : ");
                    r = scan.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println(c);
                    break;
                case 2:
                    System.out.print("Please enter the length : ");
                    l = scan.nextDouble();
                    System.out.print("Please enter the width : ");
                    w = scan.nextDouble();
                    Rectangle rect = new Rectangle(l,w);
                    System.out.println(rect);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Out of range");
            }
        }
    }
    
}
