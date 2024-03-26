/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author bmara
 */
public class Food implements ObjectInterface{
    
    private double direction;
    
    @Override
    public void turn(double degrees) {
            this.direction = Math.toRadians(degrees);
        }

    @Override
    public void place(int x, int y) {
            System.out.println("position is " + x + ", " + y);
        }
}
