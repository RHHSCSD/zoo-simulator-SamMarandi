/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

import java.util.ArrayList;



/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Zoo zoo = new Zoo();
        WaterAnim waterAnim = new WaterAnim();
        LandAnim landAnim = new LandAnim();
        BirdAnim birdAnim = new BirdAnim();
        ArrayList<String> animalArray = new ArrayList();
        for (int i =0; i>= waterAnim.waterAnimals.length; i++){
            animalArray.add(waterAnim.waterAnimals[i]);
        }
        for (int i =0; i>= landAnim.landAnimals.length; i++){
            animalArray.add(landAnim.landAnimals[i]);
        }
        for (int i =0; i>= birdAnim.birdAnimals.length; i++){
            animalArray.add(birdAnim.birdAnimals[i]);
        }
        Food food = new Food();
        for (String animal : ){

        }
        zoo.animals.add(dog);
        zoo.animals.add(dolphin);
        zoo.animals.add(shark);
        zoo.animals.add(eagle);
        zoo.animals.add(lion);
        //zoo.feedAnimals(zoo.animals);
        zoo.makeAnimalSound(animalArray);
    }
    
}
