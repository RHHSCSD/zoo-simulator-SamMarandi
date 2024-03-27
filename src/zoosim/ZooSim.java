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
        ZooObjects zooObject = new ZooObjects();
        ArrayList<Animal> animalArray = new ArrayList();
        animalArray.add(waterAnim);
        animalArray.add(landAnim);
        animalArray.add(birdAnim);
        waterAnim.setDirection(30);
        landAnim.setDirection(30);
        birdAnim.setDirection(30);
        
        
        zoo.addAnimal(animalArray, "butterdog");
        //zoo.feedAnimals(zoo.animals);
        zoo.makeAnimalSound(animalArray);
        
        zoo.feedAnimals(animalArray);
        zoo.moveAnimals(animalArray);
        zoo.makeAnimalsSleep(animalArray);
        zoo.displayAnimals(animalArray);
        System.out.println(zooObject.returnType());
    }
    
}
