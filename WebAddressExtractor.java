/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Preparing user input
        Scanner website = new Scanner(System.in);
        
        //Get user input
        System.out.print("Please enter a web address: ");
        String fullWebsite = website.nextLine();
        
        //Convert the input to lowercase
        String fullWebsiteTwo = fullWebsite.toLowerCase();
        
        //Prepare for substrings
        int websiteLength = fullWebsiteTwo.length();
        
        //Now we split the input while printing each time
        System.out.printf("Address \t:%s\n", fullWebsiteTwo);
        
        System.out.printf("Heading \t:%s\n", fullWebsiteTwo.substring(0, 3));
        
        System.out.printf("Company \t:%s\n", fullWebsiteTwo.substring(4, websiteLength -4));
        
        System.out.printf("Extension \t:%s\n", fullWebsiteTwo.substring(websiteLength -3,websiteLength -0 ));
    }
    
}
