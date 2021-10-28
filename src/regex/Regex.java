/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.ArrayList;

/**
 *
 * @author tweiderman
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listOfNumbers = new ArrayList<String>();
        
        // Creating an array list of all the test cases available.
        listOfNumbers.add("(419)123-4567");
        listOfNumbers.add("(419) 123-4567");
        listOfNumbers.add("419-123-4567");
        listOfNumbers.add("419.123.4567");
        listOfNumbers.add("419_123_4567");
        listOfNumbers.add("(419)123-456");
        listOfNumbers.add("4191234567");
        listOfNumbers.add("419123456");
        
        // Looping through the arraylist and printing out whether the phone number is valid.
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if(validNumber(listOfNumbers.get(i)))
                System.out.println(listOfNumbers.get(i) + " is a valid Phone Number!");
            else
                System.out.println(listOfNumbers.get(i) + " is not a valid Phone Number");
        //endif
        }
    }
    
    //Checking if the value passed in through "number" is a valid phone-number format or not.
    static boolean validNumber(String number){
        return number.matches("\\(?[0-9]{3}\\)?[ -.][0-9]{3}[.-][0-9]{4}");
    }
}
