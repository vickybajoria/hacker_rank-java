import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int si = a + b;
            int term = b;

            System.out.print(si + " ");

            for(int j = 1; j < n; j++)
            {
                term = 2 * term;

                si = si + term;

                System.out.print(si + " ");
            }

            System.out.println();
        }
        in.close();
    }
}

