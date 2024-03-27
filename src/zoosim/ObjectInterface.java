/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents an interface for objects with basic movement capabilities.
 * Includes methods for turning and placing objects at coordinates.
 */
public interface ObjectInterface {

    /**
     * Turns the object by the specified direction in degrees.
     * @param direction the angle in degrees by which the object will be turned
     */
    public void turn(double direction);
    
    /**
     * Places the object at the specified coordinates.
     * @param x the x-coordinate of the object's position
     * @param y the y-coordinate of the object's position
     */
    public void place(int x, int y);
}