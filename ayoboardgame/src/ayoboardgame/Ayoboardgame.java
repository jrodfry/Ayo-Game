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
String name;
String instructions = "*The game starts by placing 4 seeds in each of the 12 cups on the board (Except the Banks),*\n"
        + "*and each player sits with 6 of the cups on their side of the board, Then Choose a player to start.*\n"
        + "*For each turn, a player chooses a cup, takes all the seeds in that cup (it will be 4 seeds for the*\n"
        + "*first player, but it may be more or less as the game continues), and goes around the board in a*\n"
        + "*counterclockwise direction, planting one seed in each cup as they go until the seeds is used up*\n"
        + "*(If your last seed lands in your opponent's cup, you can capture all the seeds in that cup, and add*\n"
        + "*it to your bank but you need 4 seeds or it depends on the amount agreed on if 3 or 5 seeds.).*\n"
        + "*The game continues until one player can not move, at which point, the one with the most seeds wins.*\n\n";

String type = "What type of game will you play? Press one (1) for playing against the computer. Press two (2)\n"
        + "in order to play against another person.\n\n";
        
String firstPlayer = "Who will make the first move?\n\n";
String move = "Choose a cup.\n\n";
String wrong = "That isn't a valid cup choice, choose one that either belongs to you or\n"
        + "isn't empty.\n\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Ayoboardgame myGame = new Ayoboardgame();
   /*
    myGame.getName();
    myGame.displayHelp();
    myGame.gameType();
    myGame.firstPlayer();
    myGame.makeMove();
    myGame.wrongCup();
   */
    myGame.calAcceleration();
   }
       /* 
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
     
        public void gameType()
        {
         System.out.println(this.name + "\n");
         System.out.println(this.type);
        }
        public void firstPlayer()
        {
         System.out.println(this.name + "\n");
         System.out.println(this.firstPlayer);
        }
        public void makeMove()
        {
         System.out.println(this.move);
        }
        public void wrongCup()
        {
            System.out.println(this.wrong);
        }
        */
public void calAcceleration()
  {   
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter the Initial velocity(m/s): ");
  float initialVelocity = input.nextFloat();
  do 
    { 
     System.out.println("Please enter a number greater than 0.");
     initialVelocity = input.nextFloat();
     
    }
  while (initialVelocity < 0);

  
  System.out.println("Please enter the Final velocity(m/s): ");
  float finalVelocity = input.nextFloat();
   do
    {
     System.out.println("Please enter a number greater than 0.");
     finalVelocity = input.nextFloat();
    }
       while (finalVelocity < 0);
   
   
  System.out.println("Please enter time taken(s): ");
  float time = input.nextFloat();
  do
    {
     System.out.println("Please enter a number greater than 0.");
     time = input.nextFloat();
    }
       while (time < 0);
   
  float deltaVelocity = finalVelocity - initialVelocity;
   
  float acceleration =(int)(deltaVelocity / time);
  
  System.out.println("Your acceleration over your inputed velocity is " + acceleration);

  }
}

