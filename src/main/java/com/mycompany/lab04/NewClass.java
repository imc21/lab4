package com.mycompany.lab04;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class NewClass {
   
    
    
    public static void main(String[] args)throws FileNotFoundException{
        Utils nc = new Utils();
        
        System.out.println("The cube of 5 is " + nc.returnCube(5));
        
        System.out.println("The result of the number prime test: " + nc.checkPrime(5));
        
        System.err.println("read from file m.txt value of " + 
               nc.getIntFromFile("c://java practice//m.txt"));
    }
}
