/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents an interface for entities in the zoo simulation.
 * Extends ObjectInterface.
 */
public interface EntityInterface extends ObjectInterface {
    // Methods
    /**
     * Moves the entity.
     */
    public void move();
    
    /**
     * Makes a sound.
     */
    public void makeSound();
    
    /**
     * Eats.
     */
    public void eat();
    
    /**
     * Sleeps.
     */
    public void sleep();
}