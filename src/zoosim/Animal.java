/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author bmara
 */
public class Animal implements EntityInterface{
    private int id;
    private String name;
    private String species;
    private char sex; // 'M' or 'F'
    private int age;
    private int[] position = new int[2]; // x, y coordinates
    private String size; // Categories such as small, medium, large
    private int speed; // Categories such as slow, moderate, fast
    private double direction; // Degrees
    private boolean hunger;
    private boolean fatigue;
    private Image image; // Assuming Image is a class representing images
    private String sound;

    public boolean getHunger(){
        return hunger;
    }
    public boolean getFatigue(){
        return fatigue;
    }
    @Override
    public void move() {
        System.out.println("Animal has moved");
        double radians = Math.toRadians(this.direction);
        this.position[0] += speed*Math.cos(radians);
        this.position[1] += speed*Math.sin(radians);
        
     }

    @Override
    public void makeSound() {
        System.out.println("Raaa");
    }

    @Override
    public void eat() {
        System.out.println("Animal has ate");
        hunger = false;
    }

    @Override
    public void sleep() {
        System.out.println("Animal has slept");
        fatigue = false;
    }

    @Override
    public void turn(double degrees) {
            this.direction += degrees;
        }

    @Override
    public void place(int x, int y) {
            System.out.println("position is " + x + ", " + y);
        }
}
    //public void makeSound(){

//}