/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bmara
 */
public class Zoo {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Animal> animals = new ArrayList();
    
    public void feedAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            if (animal.getHunger()){
                animal.eat();
            }
        }
    }
    
    public void makeAnimalsSleep(ArrayList<Animal> animals){
        for (Animal animal : animals){
            if (animal.getFatigue()){
                            animal.sleep();
            }
        }
    }
    
    public void moveAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            animal.move();
        }
    }
    public void makeAnimalSound(ArrayList<Animal> animals){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
    public void placeAnimal(ArrayList<Animal> animals){
        System.out.println("What do you want the x cordinate to be");
        int x = scanner.nextInt();
        System.out.println("What do you want the y cordinate to be");
        int y = scanner.nextInt();
        for (Animal animal : animals){
            animal.place(x,y);
        }
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void displayAnimals(ArrayList<Animal> animals){
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
}
