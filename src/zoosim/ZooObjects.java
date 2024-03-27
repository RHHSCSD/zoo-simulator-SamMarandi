/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.Arrays;

/**
 * Represents various objects in a zoo.
 * Provides methods to determine the type of objects and to turn and place them.
 */
public class ZooObjects implements ObjectInterface{

    private double direction;
    private String[] type= {"Rock", "Food", "tree"};
    private double size;
    private int xCoordinate;
    private int yCoordinate;
    
    /**
     * Returns the types of objects.
     * @return a string containing the types of objects
     */
    public String returnType(){
        String string= "";
        for (int i=0;i< type.length;i++){
            System.out.println(type[i]);
            string += type[i] + ", ";
        }
        return string;
    }

    /**
     * Turns the object by the specified degrees.
     * @param degrees the number of degrees to turn the object
     */
    @Override
    public void turn(double degrees) {
            this.direction += degrees;
        }

    /**
     * Places the object at the specified coordinates.
     * @param x the x coordinate of the object
     * @param y the y coordinate of the object
     */
    @Override
    public void place(int x, int y) {
            System.out.println("position is " + x + ", " + y);
    }
}