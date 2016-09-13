// Java program to check whether given line is pangram or not.
// Pangrams are sentences constructed by using every letter of the alphabet at least once.
// Appeared in HackerRank as a practice question.

import java.util.*;

public class PangramChecker 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String input = line.toLowerCase();
        for(char chr='a';chr<='z';chr++)
        {
            if(input.indexOf(chr)== -1)
            {
                System.out.println("not pangram");
                System.exit(0);
            }
        }
            System.out.println("pangram");       
    }
}
