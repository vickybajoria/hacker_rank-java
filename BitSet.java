import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        scan.nextLine();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        for(int i = 0; i < M; i++)
        {
            String[] s = scan.nextLine().split("\\s+");

            switch(s[0])
            {
                case "AND":
                    if(Integer.parseInt(s[1]) == 1)
                        B1.and(B2);
                    else
                        B2.and(B1);
                    break;
                case "OR":
                    if(Integer.parseInt(s[1]) == 1)
                        B1.or(B2);
                    else
                        B2.or(B1);
                    break;
                case "FLIP":
                    if(Integer.parseInt(s[1]) == 1)
                        B1.flip(Integer.parseInt(s[2]));
                    else
                        B2.flip(Integer.parseInt(s[2]));
                    break;
                case "XOR":
                    if(Integer.parseInt(s[1]) == 1)
                        B1.xor(B2);
                    else
                        B2.xor(B1);
                    break;
                case "SET":
                    if(Integer.parseInt(s[1]) == 1)
                        B1.set(Integer.parseInt(s[2]));
                    else
                        B2.set(Integer.parseInt(s[2]));
                    break;
            }
            System.out.print(B1.cardinality() + " ");
            System.out.println(B2.cardinality());
        }
    }
}

