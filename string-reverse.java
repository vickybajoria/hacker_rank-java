import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int i = 0;
        int j = A.length() - 1;

        while(i < j)
        {
            if(A.charAt(i) != A.charAt(j))
                break;
            
            i++;
            j--;
        }

        if(i < j)
            System.out.println("No");
        else
            System.out.println("Yes");

        
    }
}



