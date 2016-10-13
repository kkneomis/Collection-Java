/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author simeonkakpovi
 */
public class CollectionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String done = "y";
        
        ArrayList<String> movies = new ArrayList<>();
        
        while(!done.equals("n")){
           System.out.println("What movie would you like to add?");
           String movie = sc.nextLine();
           movies.add(movie);
           
           
           String temp ="";
           while(!temp.equals("y") && !temp.equals("n")){
               System.out.println("Would you like to add another movie? (y/n)");
               temp = sc.nextLine();
           } //inner while 
           
           done = temp;
       }//outer while
        
        Collections.sort(movies); 
        System.out.println("/***********************/");
        for (String movie:movies) { 
            System.out.println(movie); 
        }
       
    }
    
}
