/*
We consider a word, , to be beautiful if the following two conditions are satisfied:

No two consecutive characters are the same.
No two consecutive characters are in the following vowel set: a, e, i, o, u, y. Note that we consider y to be a vowel in this challenge.

Input Format

A single string denoting w.

Output Format

Print Yes if  is beautiful, or No if it is not.

Sample Input 0

abacaba
Sample Output 0

Yes

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        
        for(int i=0;i<w.length()-1;i++){
            if(!isBeautiful(w.charAt(i),w.charAt(i+1))){
                System.out.println("No");
                System.exit(0);
            }   
        }
        System.out.println("Yes");
    }
    
    static boolean isBeautiful(char ch1, char ch2){
        if(ch1 == ch2){
            return false;   
        }            
        else if((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='y') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='y')){
            return false;
        }
        else{
            return true;
        }
    }
}
