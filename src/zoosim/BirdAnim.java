/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;

/**
 *
 * @author bmara
 */
/**
 * Represents a bird animal entity in the zoo simulation.
 */
public class BirdAnim extends Animal implements Flyable {
    // Fields
    private boolean canFly; // Indicates if the bird can fly
    
    // Constructor
    /**
     * Constructs a new BirdAnim object.
     */
    public BirdAnim() {
        // Initialize animalList and add bird species
        animalList = new ArrayList<>();
        animalList.add("Eagle");
        animalList.add("Parrot");
        animalList.add("Raven");
    }
    
    // Methods
    /**
     * Makes the bird fly.
     */
    @Override
    public void fly() {
        // Output that the bird is flying
        System.out.println("Animal is flying");
    }

    /**
     * Makes the bird land.
     */
    @Override
    public void land() {
        // Output that the bird has landed
        System.out.println("Animal has landed");
    }

    /**
     * Checks if the bird is flying.
     * @return true if the bird is flying, false otherwise.
     */
    @Override
    public boolean isFlying() {
        return canFly;
    }
    
    /**
     * Overrides the makeSound method to produce bird noises.
     */
    @Override
    public void makeSound() {
        // Output bird noises
        System.out.println("*bird noises*");
    }
}
