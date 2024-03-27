/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents an interface for objects with swimming capabilities.
 * Includes a method to determine if the object can surface.
 */
public interface Swimmable {
    
    /**
     * Checks if the object can surface.
     * @return true if the object can surface, false otherwise
     */
    public boolean canSurface();
}