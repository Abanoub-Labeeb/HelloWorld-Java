/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author abanoub.labeeb
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //read number from user
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Please enter 1st number :");
        int x = sc.nextInt();
        
        
        System.out.println("Please enter 2st number :");
        int y = sc.nextInt();
        
        int z = x + y;
        
        System.out.println("Sum is : " + z);

        
    }
    
}
