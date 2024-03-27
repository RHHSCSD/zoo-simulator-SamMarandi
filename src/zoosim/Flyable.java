/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents an interface for entities that can fly.
 */
public interface Flyable {
    
    // Methods
    
    /**
     * Makes the entity fly.
     */
    public void fly();
    
    /**
     * Makes the entity land.
     */
    public void land();
    
    /**
     * Checks if the entity is currently flying.
     * @return true if the entity is flying, false otherwise
     */
    public boolean isFlying();
    
}
