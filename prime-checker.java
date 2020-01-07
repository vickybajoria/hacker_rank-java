import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime
{
    void checkPrime(int ... a)
    {
        for(int i: a)
        {
            BigInteger big = new BigInteger(Integer.toString(i));
            if(big.isProbablePrime(1000))
                System.out.print(i + " ");
        }
        System.out.println();
    }
}


public class Solution {