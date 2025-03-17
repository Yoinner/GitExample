/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author ygandara
 */
public class Cat {
   private int age;
   private double weigth;
   private double heigth;
   private String race;

    public Cat(int age, double weigth, double heigth, String race) {
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cat(" + "race=" + race + ')';
    }
   
   
}
