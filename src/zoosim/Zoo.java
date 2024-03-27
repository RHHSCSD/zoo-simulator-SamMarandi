/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a Zoo where various operations can be performed on animals.
 * Provides methods for feeding, making animals sleep, moving, making sound,
 * placing, displaying, and adding animals.
 */
public class Zoo {
    
    Scanner scanner = new Scanner(System.in);
    
    /**
     * Feeds the animals in the zoo.
     * @param animals the list of animals to feed
     */
    public void feedAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            if (animal.getHunger()){
                for (String animalName : animal.animalList) {
                    System.out.print(animalName + " ");
                    animal.eat();
                }
                animal.setHunger();
            }
            else {
                for (String animalName : animal.animalList) {
                    System.out.print(animalName + " ");
                    System.out.println("is not hungry");
                }
            }
        }
    }
    
    /**
     * Makes the animals in the zoo sleep.
     * @param animals the list of animals to make sleep
     */
    public void makeAnimalsSleep(ArrayList<Animal> animals){
        for (Animal animal : animals){
            if (animal.getFatigue()){
                for (String animalName : animal.animalList) {
                    System.out.print(animalName + " ");
                    animal.sleep();
                }
                animal.setFatigue();
            }
            else {
                for (String animalName : animal.animalList) {
                    System.out.print(animalName + " ");
                    System.out.println("is not sleepy");
                }
            }
        }
    }
    
    /**
     * Moves the animals in the zoo.
     * @param animals the list of animals to move
     */
    public void moveAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            for (String animalName : animal.animalList) {
                System.out.print(animalName + ", ");
            }
            animal.move();
        }
    }
    
    /**
     * Makes the animals in the zoo produce sounds.
     * @param animals the list of animals to make sound
     */
    public void makeAnimalSound(ArrayList<Animal> animals){
        for (Animal animal : animals){
            for (String animalName : animal.animalList) {
                System.out.print(animalName + ": ");
                animal.makeSound();
            }
        }
    }
    
    /**
     * Places the animals in the zoo at specified coordinates.
     * @param animals the list of animals to place
     */
    public void placeAnimal(ArrayList<Animal> animals){
        System.out.println("What do you want the x coordinate to be");
        int x = scanner.nextInt();
        System.out.println("What do you want the y coordinate to be");
        int y = scanner.nextInt();
        for (Animal animal : animals){
            animal.place(x,y);
        }
    }
    
    /**
     * Displays the animals in the zoo.
     * @param animals the list of animals to display
     */
    public void displayAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            for (String animalName : animal.animalList) {
                System.out.println(animalName);
            }
        }
    }
    
    /**
     * Adds an animal to the specified category in the zoo.
     * @param animals the list of animals to add the new animal to
     * @param animalName the name of the animal to add
     */
    public void addAnimal(ArrayList<Animal> animals, String animalName){
        System.out.println("Which category would you like to add this animal to, BirdAnim, WaterAnim, or LandAnim?");
        String response = scanner.next();
        if (response.equals("BirdAnim")){
            animals.get(2).animalList.add(animalName);
        }
        if (response.equals("WaterAnim")){
            animals.get(0).animalList.add(animalName);
        }
        if (response.equals("LandAnim")){
            animals.get(1).animalList.add(animalName);
        }
        else{
            System.out.println("That category was not listed");
        }
    }
}