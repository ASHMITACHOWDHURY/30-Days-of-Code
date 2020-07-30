/*
 Quick way to check if all the characters of a string are same
 */
package day5;
import java.io.*;
import java.util.*;
public class Day5 {
    static boolean myCharac(String s)
    {
        for(int i=1;i<s.length();i++)
            if(s.charAt(i) == s.charAt(0))
                return true;
        
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(myCharac(str))
            System.out.println("Yes,all character are same.");
        else
            System.out.println("No,all character are not same.");
    }
    
}
