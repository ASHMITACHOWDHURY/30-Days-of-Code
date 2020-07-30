/*
Program to find the initials of a name.
 */
package day6;
import java.io.*;
import java.util.*;
public class Day6 {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println(Character.toUpperCase(str.charAt(0)));
     for(int i=1;i<str.length()-1;i++)
     {
         if(str.charAt(i)== ' ')
         {
             System.out.println(" "+Character.toUpperCase(str.charAt(i+1)));
         }
        
     }
    }
    
}
