/*
Removing punctuations from a given string
 */
package day3;

import java.io.*;
import java.util.*;
public class Day3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); //eg,enter Welcome???@@##$ to#$% 30%$^ Days$%^& Of $#Code@!
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
        
    }
    
}
