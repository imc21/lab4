package com.mycompany.lab04;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public  class Utils {
    
    int returnCube(int x){
        return x * x * x;
    }
    
   public static boolean checkPrime(int x){
       for(int i =2; i<x;i++){
           if(x%i ==0){
               return false;
           }
       }
       return true;
   }
   
   int getIntFromFile(String fileName) throws FileNotFoundException{
       int num;
       Scanner sc = new Scanner(new File(fileName));
       num = sc.nextInt();
       return num;
   }
   
}
