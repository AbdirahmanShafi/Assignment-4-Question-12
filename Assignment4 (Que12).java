/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author abdir
 */
public class Assignment4Q12 {
    
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 50) {
            if (number % 2 != 0) { 
                sum += number;
            }
            number++;
        }

        System.out.println("The sum of odd numbers from 1 to 50 is: " + sum);
    }
}

