/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity04b_bsemc.dat2_fernandez;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Activity04B_BSEMCDAT2_Fernandez {
    
    public static int[] findLocationDelete(int [] array, int sub){
        
        if(array == null || sub < 0 || sub >= array.length) {
                 
        return array;    
    }
        return IntStream.range(0, array.length) .filter(i -> i != sub)
                       
        .map (i -> array[i]) .toArray();
        
    }
    
    public static void main (String [] args) {
    int array[] = {1, 2, 3, 4, 5};
         
     String choice;
     Scanner sc = new Scanner(System.in);
     System.out.println("Choose an option: ");
     System.out.print("A. Input a value\nB. Delete a value\nC. Traverse the array\nD. Exit ");
        System.out.println(" ");
        choice = sc.nextLine();
    
    switch(choice) {
    case "a":
         case "A":
   
             
        {int val;
        
         int pos;
         System.out.println("Add "
                 + " value has been chosen.");
          System.out.println("Please indicate an index format: 0-4");
          pos = sc.nextInt();
     
            int Index_position = pos;

            System.out.print("\nCurrent Array: " + Arrays.toString(array));
            System.out.print("\nInsert value: ");
                val = sc.nextInt();
                for(int i = array.length -1; i > Index_position; i--){
                array[i] = array[i-1];
            
                }
                array[Index_position] = val;
                System.out.println("A new value has been inserted: ");
                System.out.println(Arrays.toString(array));
                break;}
    

    case "b":
     case "B":    
  
        { int sub, i = 0;
        System.out.println("Delete a value has been chosen.");
        System.out.print("\nCurrent array: " + Arrays.toString(array));
        System.out.println("\nPlease indicate an index format: 0-4 ");
            sub =sc.nextInt();
            array = findLocationDelete(array, sub);

        System.out.println("Element has been yeeted: ");
        System.out.println(Arrays.toString(array));
        
        
        break;}
    
 
    case "c":
         case "C":
   
        {System.out.println("Taverse Array has been chosen.");
        for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
        }
        break;}
    

    case "d":
         case "D":
        {System.out.println("System exit.");
        
        
        break;
        
        
            }   
        }
    }
 }
