/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package ayoboardgame;

import java.util.Scanner;

/**
*
* @author Ehikpemokan Abhulimen
*/
public class Ayoboardgame
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mass;
        int acceleration;
        int force;
        
        System.out.println("Please enter a Mass: ");
        mass = input.nextInt();
        System.out.println("Your mass is " + mass);
        
        System.out.println("Please enter a Acceleration: ");
        acceleration = input.nextInt();
        System.out.println("Your mass is " + acceleration);
        
        force = mass * acceleration;
        System.out.println("Force will now be: " + force);
        
        if (force >= 200)
            System.out.println((double)force + "\tForce is too great");
        else
            System.out.println((double)force + "\tForce is too low");
         
        
    }

   
    
}