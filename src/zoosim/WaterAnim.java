/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;

/**
 * Represents a subclass of Animal that can swim and surface in water.
 * Implements the Swimmable interface.
 */
public class WaterAnim extends Animal implements Swimmable{
    
    private boolean canBreath; // Determines if the animal can breathe underwater
    private boolean canSwim; // Determines if the animal can swim
    
    /**
     * Constructor for WaterAnim class.
     * Initializes the animal list with water animals.
     */
    public WaterAnim(){
        animalList= new ArrayList<>();
        animalList.add("Shark");
        animalList.add("Dolphin");
        animalList.add("Fish");
    }
    
    /**
     * Checks if the animal can surface.
     * @return true if the animal can surface, false otherwise
     */
    @Override
    public boolean canSurface() {
        return canSwim;
    }
    
    /**
     * Produces the sound made by water animals.
     */
    @Override
    public void makeSound(){
        System.out.println("*water noises*");
    }
}






