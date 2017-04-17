/*
Consider an unsorted array, , of distinct integers from  to . We can swap two adjacent elements in  any number of times as long as the absolute difference between these elements is .

For example, the diagram below depicts an array where we can swap adjacent elements 1 and 2 or 4 and 3, but we cannot swap adjacent elements 2 and 0 or 0 and 4:
[ 1, 2, 0, 4, 3]

Sample Input 0

2
4
1 0 3 2
3
2 1 0
Sample Output 0

Yes
No
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AccurateSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int SwapCount = 1;
            int i =0,temp;
            while(SwapCount>0){
                SwapCount=0;
                for(i=0;i<n-1;i++){                
                    if(a[i]>a[i+1] && Math.abs(a[i]-a[i+1])==1){
                        temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                        SwapCount++;
                    }
                }
                if(SwapCount==0)
                    break;
            }

            // Check if sorted
            boolean flag=true;
            for(i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    flag = false;
                    System.out.println("No");
                    break;
                }
            }
            if(flag==true){
                System.out.println("Yes");
            }
        }
    }
}
