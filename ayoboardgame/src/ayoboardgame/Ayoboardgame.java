/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ayoboardgame;

import java.util.Scanner;

/**
 *
 * @author Amy Fry
 */
public class Ayoboardgame 
{
String name;
String instructions = "The game starts by placing 4 seeds in each of the 12 cups on the board (Except the Banks),\n"
        + "and each player sits with 6 of the cups on their side of the board, Then Choose a player to start.\n"
        + "For each turn, a player chooses a cup, takes all the seeds in that cup (it will be 4 seeds for the\n"
        + "first player, but it may be more or less as the game continues), and goes around the board in a\n"
        + "counterclockwise direction, planting one seed in each cup as they go until the seeds is used up\n"
        + "(If your last seed lands in your opponent's cup, you can capture all the seeds in that cup, and add\n"
        + "it to your bank but you need 4 seeds or it depends on the amount agreed on if 3 or 5 seeds.).\n"
        + "The game continues until one player can not move, at which point, the one with the most seeds wins.\n\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Ayoboardgame myGame = new Ayoboardgame();
    myGame.getName();
    myGame.displayHelp();
    
    }
        
        public void getName()
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        }
         public void displayHelp()
        {
        System.out.println("\nWelcome "+ this.name + "\n");
        System.out.println(this.instructions);
        }
   
}

