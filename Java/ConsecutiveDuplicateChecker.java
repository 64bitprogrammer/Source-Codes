// Shashank likes strings in which consecutive characters are different. 
// For example, he likes ABABA, while he doesn't like ABAA. Given a string 
// containing characters  and  only, he wants to change it into a string he 
// likes. To do this, he is allowed to delete the characters in the string.

// Your task is to find the minimum number of required deletions.
// Problem appeared in hackerrank

import java.util.*;

public class ConsecutiveDuplicateChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        int count=0,k,j,i;
        for( i=0;i<n;i++)
        {
            str = sc.next();
            j=0;
            while( j<str.length())
            {
                for( k=j+1;k<str.length();k++)
                {
                    if(str.charAt(j)== str.charAt(k))
                        count++;
                    else
                        break;
                }
                j=k;
            }
            System.out.println(count);
            count=0;
        }
        
    }
}
