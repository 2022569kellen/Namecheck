/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namecheck;

import java.util.Scanner;

/**
 *
 * @author Kellen Custodio
 */
public class Namecheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String myName; //declaring variable String//
        Scanner myKB = new Scanner (System.in); //creat a object of scanner//
      
 System.out.println("Please, enter your full name:"); //Give output the text for user//
      myName = myKB.nextLine().trim(); //Stores the typed word by the user into the variable myName, without spaces//
       
      if (myName.matches("[A-Za-z ]+") && (myName.contains(" "))) { //Condition true, if user's name there are just letters and spaces between the text//
        System.out.println( "Blogger name is: " + myName.trim().toUpperCase().charAt( 1)+"pop".toLowerCase()+"st@r".toUpperCase());
        } //if the name contains olny letters and spaces between the text, print message with the new blogger name//
        
        else { //Condition false//
            System.out.println("Invalid- please enter your full name"); //Output error message if the user's typed a text without letters and no spaces between text//
           
            }
    } }    // TODO code application logic here
    
    

