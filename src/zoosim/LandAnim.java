/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;

/**
 * Represents a subclass of Animal that inhabits land.
 * It includes specific animals such as Lion, Dog, Cat, and Tiger.
 */
public class LandAnim extends Animal {
    
    // Constructor
    
    /**
     * Constructs a LandAnim object and initializes the animal list with land animals.
     */
    public LandAnim() {
        animalList = new ArrayList<>();
        animalList.add("Lion");
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Tiger");
    }
    
    // Methods
    
    /**
     * Overrides the makeSound method to produce a specific sound for land animals.
     */
    @Override
    public void makeSound() {
        System.out.println("ROARROARROAR");
    }
}