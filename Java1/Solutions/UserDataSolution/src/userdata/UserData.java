
package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println( "What is your name?" );
       String name = keyboard.nextLine();
       System.out.println("Hi, " + name + "! How old are you?");
       int age = Integer.parseInt(keyboard.nextLine());
       System.out.println(age + ", huh? So what year were you born in?");
       int birthYear = Integer.parseInt(keyboard.nextLine());
       System.out.println("What month?");
       String birthMonth = keyboard.nextLine();
       System.out.println("What day of " + birthMonth + "?");
       int birthDay = Integer.parseInt(keyboard.nextLine());
       System.out.println("What is your favorite book?");
       String book = keyboard.nextLine();
       System.out.println("What is your hometown?");
       String hometown = keyboard.nextLine();
       System.out.println("What is your lucky number?");
       double num = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is your shoe size?");
       double shoe = Double.parseDouble(keyboard.nextLine());
       System.out.println("On a scale of 1 to 5, how excited are you to learn Java?");
       double excitement = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is one cool fact about you?");
       String fact = keyboard.nextLine();
      
       System.out.print(name + ", age " + age +", was born on " + birthMonth+ " " +birthDay +", " + birthYear + ". ");
       System.out.print("From " + hometown + ", " + name + " has lucky number " + num + " and a shoe size of " + shoe + ". ");
       System.out.print("On a scale of 1 to 5, " + name + " is this excited to learn about Java: " + excitement + "! ");
       System.out.println("A fun fact about " + name + " is: " + fact);

      int futureAge = age + 5;
      boolean golden = (age == birthDay);
      boolean young = (birthYear/2000 > 1);
      double random = shoe * excitement;
      
       System.out.println(name + " will be " + futureAge + " in 5 years. ");
       System.out.println("Age is the same as birth day: " + golden);
       System.out.println("They were born in this century: " + young);
       System.out.println("Shoe size times excitement level is: " + random);

    }
    
}
