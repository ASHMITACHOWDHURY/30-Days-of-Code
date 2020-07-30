/*Check Whether a number is Duck Number or not
*/
package day7;
import java.io.*;
import java.util.*;
public class Day7 {
    static boolean check_duck(String num) 
    { 
        
        int i = 0, n = num.length(); 
        while (i < n && num.charAt(i) == '0') 
            i++; 
  
        
        while (i < n) { 
            if (num.charAt(i) == '0') 
                return true; 
            i++; 
        } 
  
        return false; 
    } 

    public static void main(String[] args)
    {
     String num = "123"; 
        if (check_duck(num)) 
            System.out.println("It is a duck number"); 
        else
            System.out.println("It is not a duck number"); 
        
    }
    
}
