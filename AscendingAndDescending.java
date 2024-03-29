/*

Filename: AscendingAndDescending.java
Author: Carol Ann Killeen
Date: 8/1/19

*/

import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String[] args) 
    {
        // variables and constants
        int num1;
        int num2;
        int num3;
        int low;
        int med;
        int high;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your first integer below >> ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter your second integer below >> ");
        num2 = keyboard.nextInt();

        System.out.print("Please enter your third integer below >> ");
        num3 = keyboard.nextInt();

        if(num1 <= num2 && num1 <= num3)
     {
        low = num1;
        if(num2 <= num3)
        {
           med = num2;
           high = num3;
        }
        else
        {
           med = num3;
           high = num2;
        }
     }
     else
     {
        if(num2 <= num1 && num2 <= num3)
        {
            low = num2;
            if(num1 <= num3)
            {
               med = num1;
               high = num3;
            }
            else
           {
               med = num3;
               high = num1;
           }
        }
        else
        {
           low = num3;
           if(num1 <= num2)
           {
              med = num1;
              high = num2;
           }
           else
           {
              med = num2;
              high = num1;
           }
        }
     }

        // output phase
        System.out.println("Ascending: " + low + " " + med + " " + high);
        System.out.println("Descending: " + high + " " + med + " " + low);
    } // end of main
} // end of class
     