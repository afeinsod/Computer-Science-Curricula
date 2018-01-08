
package chooseyourownadventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("There is a dragon guarding the castle. Do you 'fight' or 'walk' away?"); //ROOM 1
        String response = keyboard.nextLine();
        if (response.equals("fight")) {
            System.out.println("You beat the dragon! You see a 'hallway' and a 'staircase'. Where do you go?"); //ROOM 2
            response = keyboard.nextLine();
            if (response.equals("hallway")) {
                System.out.println("You walk through the hallway and see a banquet hall. Do you stop and 'eat' or go on to the 'throne' room?"); //ROOM 3
                response = keyboard.nextLine();
                if (response.equals("eat")) {
                    System.out.println("You eat yourself sick and then sleep it off on a table. Nice night!"); //ROOM 4
                }
                else if (response.equals("throne")) {
                    System.out.println("The queen says 'Off with your head!' and you die! Bummer."); //ROOM 5
                }
                else {
                    System.out.println("Invalid option, please type one of the choices");
                }
            }
            else if (response.equals("staircase")) {
                System.out.println("You go up the staircase and see a sphynx guarding a door, and another door unmarked. "
                        + "Do you try to get past the 'sphynx' or go for the 'unmarked' door?"); //ROOM 6
                response = keyboard.nextLine();
                if (response.equals("sphynx")) {
                    System.out.println("You get past the sphynx and go into a room where you find a beautiful price. "
                            + "You marry and live happily ever after. Mazel Tov!"); // ROOM 7
                }
                else if (response.equals("unmarked")) {
                    System.out.println("You walk through the unmarked door and fall to your death off an edge. Oops!"); //ROOM 8
                }
                else {
                    System.out.println("Invalid option, please type one of the choices");
                }
            }
            else {
                System.out.println("Invalid option, please type one of the choices");
            }
        }
        
        
        
        
        
        
        else if (response.equals("walk")) {
           System.out.println("You find a drawbridge and you want to cross it. Do you ride your 'horse' across it"
                   + "or 'crawl' across the bridge?"); //ROOM 9
            response = keyboard.nextLine();
            if (response.equals("horse")) {
                System.out.println("You and your horse fall through the drawbridge into a pit of lava! "
                        + "Do you 'push' your horse down to climb on a rock or try to 'swim' out?"); //ROOM 10
                response = keyboard.nextLine();
                if (response.equals("push")) {
                    System.out.println("You are mean to animals! You and the horse die in the lava."); //ROOM 11
                }
                else if (response.equals("swim")) {
                    System.out.println("You swim to a rock and climb out. You wait a very long time to be rescued..."); //ROOM 12
                }
                else {
                    System.out.println("Invalid option, please type one of the choices");
                }
            }
            else if (response.equals("crawl")) {
                System.out.println("You crawl over the drawbridge and find yourself facing a steep wall. Do you "
                        + "try to 'climb' it or turn around and go 'back'?"); //ROOM 13
                response = keyboard.nextLine();
                if (response.equals("climb")) {
                    System.out.println("You climb up the wall and into a room full of jewels. You're rich!"); //ROOM 14
                }
                else if (response.equals("back")) {
                    System.out.println("You go home and go to bed. What a fun day!"); //ROOM 15
                }
                else {
                    System.out.println("Invalid option, please type one of the choices");
                }
            }
            else {
                System.out.println("Invalid option, please type one of the choices");
            } 
        }
        
        
        
        
        
        else {
            System.out.println("Invalid option, please type one of the choices");
        }
    }
    
}
