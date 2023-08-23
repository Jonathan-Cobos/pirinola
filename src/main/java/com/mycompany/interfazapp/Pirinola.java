/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfazapp;


import java.io.Console;
import static java.lang.Double.max;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class Pirinola {

    private String cara1, cara2, cara3, cara4, cara5, cara6;

    //constructo
    public Pirinola() {
        this.cara1 = "tomaTodo";
        this.cara2 = "tondosPone";
        this.cara3 = "pon1";
        this.cara4 = "pon2";
        this.cara5 = "toma1";
        this.cara6 = "toma2";
    }

    public Pirinola(String tomaTodo, String tondosPone, String pon1, String pon2, String toma1, String toma2) {
        this.cara1 = tomaTodo;
        this.cara2 = tondosPone;
        this.cara3 = pon1;
        this.cara4 =pon2;
        this.cara5 =toma1;
        this.cara6 =toma2;
    }

    public void girar() {

        int giro = (int) Math.round(Math.random() * (100 - 1) + 1);

        System.out.println("Numero de giros de la pirinola = " + giro);
      
    }

    public void cara() {
        int cara = (int) Math.round(Math.random() * (6 - 1) + 1);

        switch (cara) {

            case 1:
                System.out.println("cara= " +this.cara1);
                break;

            case 2:
                System.out.println("cara= " +this.cara2);
                break;

            case 3:
                System.out.println("cara= " +this.cara3);
                break;

            case 4:
                System.out.println("cara= " +this.cara4);
                break;

            case 5:
                System.out.println("cara= " +this.cara5);
                break;

            case 6:
                System.out.println("cara= " +this.cara6);
                break;

        }

    }

}
