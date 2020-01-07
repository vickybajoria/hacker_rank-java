import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger n1 = scan.nextBigInteger();
        BigInteger n2 = scan.nextBigInteger();

        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}

