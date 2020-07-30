/*
Program to check if input is an integer or a string
*/
package day4;
import java.io.*;
import java.util.*;
public class Day4 {

    static boolean isNumber(String s)
    {
        for(int i=0;i<s.length();i++)
            if(Character.isDigit(s.charAt(i))==false)
                return false;
        
                return true;
        
    }
    public static void main(String[] args) {
    String str="6340B";
    if(isNumber(str))
        System.out.println("Integer");
    else
        System.out.println("String");
    }
    
}
