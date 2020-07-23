/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char s1[]="GEEKSFORGEEKS".toCharArray();
        char s2[]=new char[s1.length];;
        int index=0;
         int i = 0; 
        for (i = 0; i < s1.length; i++) 
        {s2[i] = s1[i]; }
        
        System.out.println(String.valueOf(s2)); 
        
    }
    
}
