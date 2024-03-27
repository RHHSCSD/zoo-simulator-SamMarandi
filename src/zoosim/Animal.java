/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;

/**
 * Represents an animal entity in the zoo simulation.
 */
public class Animal implements EntityInterface {
    // Fields
    private int id; // Unique identifier for each animal
    private String name; // Name of the animal
    private String species; // Species of the animal
    private char sex; // Sex of the animal (M/F)
    private int age; // Age of the animal
    private double[] position = new double[2]; // Position of the animal (x, y coordinates)
    private String size; // Size of the animal (e.g., small, medium, large)
    private int speed = 3; // Speed of the animal (e.g., slow, moderate, fast)
    private double direction; // Direction of the animal in degrees
    private boolean hunger = true; // Indicates if the animal is hungry
    private boolean fatigue = true; // Indicates if the animal is fatigued
    private Image image; // Image representing the animal
    private String sound; // Sound produced by the animal
    protected ArrayList<String> animalList; // List of animals
    
    /**
     * Gets the hunger status of the animal.
     * @return true if the animal is hungry, false otherwise.
     */
    public boolean getHunger(){
        return hunger;
    }

    /**
     * Gets the fatigue status of the animal.
     * @return true if the animal is fatigued, false otherwise.
     */
    public boolean getFatigue(){
        return fatigue;
    }

    /**
     * Sets the hunger status of the animal to false.
     */
    public void setHunger(){
        hunger = false;
    }

    /**
     * Sets the fatigue status of the animal to false.
     */
    public void setFatigue(){
        fatigue = false;
    }

    /**
     * Gets the direction of the animal.
     * @return the direction of the animal in degrees.
     */
    public double getDirection() {
        return direction;
    }

    /**
     * Sets the direction of the animal.
     * @param direction the direction of the animal in degrees.
     */
    public void setDirection(double direction) {
        this.direction = direction;
    }
    /**
     * Moves the animal based on its current direction and speed.
     */
    @Override
    public void move() {
        // Calculate new position based on current direction and speed
        double radians = Math.toRadians(this.direction);
        this.position[0] += speed*Math.cos(radians);
        this.position[1] += speed*Math.sin(radians);
        // Output the new position
        System.out.println("Animal has moved to new position: (" + this.position[0] + ", "+ this.position[1] + ")");
    }

    /**
     * Makes the animal produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        // Output the sound made by the animal
        System.out.println("Animal makes a sound: " + sound);
    }

    /**
     * Simulates the animal eating and reduces hunger.
     */
    @Override
    public void eat() {
        // Indicate that the animal has eaten and set hunger to false
        System.out.println("Animal has eaten.");
        hunger = false;
    }

    /**
     * Simulates the animal sleeping and reduces fatigue.
     */
    @Override
    public void sleep() {
        // Indicate that the animal has slept and set fatigue to false
        System.out.println("Animal has slept.");
        fatigue = false;
    }

    /**
     * Turns the animal by the specified number of degrees.
     * @param degrees The number of degrees by which to turn the animal.
     */
    @Override
    public void turn(double degrees) {
        // Turn the animal by the specified number of degrees
        this.direction += degrees;
    }

    /**
     * Places the animal at the specified position.
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     */
    @Override
    public void place(int x, int y) {
        // Output the position where the animal is placed
        System.out.println("Animal is placed at position: (" + x + ", " + y + ")");
    }
}