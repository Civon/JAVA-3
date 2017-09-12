//Assignment3.java
/**
 * Assignment #: 3
 * Name: 		¸â¶v³ó
 * StudentID: 	405530018
 * Description: Assignment 3 class displays a menu of choices to a user
 *    and performs the chosen task. It will keep asking a user to
 *    enter the next choice until the choice of 'Q' (Quit) is entered.
 * Time spent:	1 hours
 */

/**
 * @author Chunyoa Chan
 * @project 405530018_3_objectInstacemethodEncapsulation
 * @date 2017-04-27
 */

// Under this line is copy from Teacher & modify by author

import java.io.*;    //to use InputStreamReader and BufferedReader //but IDE say never used
import java.util.*;

  /**execute Car class & control a set of action( create a car object and ADD, Dispay it)*/
public class Assignment3
 {
  public static void main (String[] args)
   {
       
       // local variables, can be accessed anywhere from the main method
       char action = 'Z';
       String year, color, country, manufac, brand = null;
       double price = 0.0;
       
       // int date, month, year; 
       String line = new String();

       // instantiate a Car object
       Car carObject = new Car();
       //Makes makesObject = new Makes();
       printMenu();

       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);

       do  // will ask for user input
        {
         System.out.println("What action would you like to perform?");
         line = scan.nextLine();

         if (line.length() == 1)
          {
           action = line.charAt(0);
           action = Character.toUpperCase(action);

           // matches one of the case statement
           switch (action)
            {
             case 'A':   //Add Car
               System.out.println("Please enter the car information:");
               System.out.println("What is the car¡¦s manufacturer?");
               manufac = scan.nextLine();
               System.out.println("What is the car brand?");
               brand = scan.nextLine();
               System.out.println("Which country is the car made?");
               country = scan.nextLine();
               System.out.println("What year was the car made?");
               year = scan.nextLine();
               System.out.println("What color is the car?");
               color = scan.nextLine();
               System.out.println("How much was the car's price?");
               price = Double.parseDouble(scan.nextLine());	//use parse so wont have re-do bugS (?
               // set info
               carObject.setYear(year);
               carObject.setColor(color);
               carObject.setPrice(price);
               carObject.setMakes(country, manufac, brand);
               //makesObject.setCountry(country);
               //makesObject.setManufac(manufac);
               //makesObject.setBrand(brand);
             	break;

             case 'D':   //Display Car            	 
            		 System.out.println(carObject.toString());
            		 //System.out.println("Have not set Car info yeat!\n");
               break;

             case 'Q':   //Quit
               break;

             case '?':   //Display Menu
               printMenu();
               break;

             default:
               System.out.println("Unknown action");
               break;
            }
          }
         else //if length != 1 print error and do loop again
          {
           System.out.println("Unknown action");
          }
        } while (action != 'Q' || line.length() != 1);
        //scan.close();	// close scanner
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Car\n" +
                        "D\t\tDisplay Car\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}
