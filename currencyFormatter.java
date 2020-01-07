import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nf_us = NumberFormat.getCurrencyInstance();
        NumberFormat nf_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf_india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat nf_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        
        System.out.println("US: " + nf_us.format(payment));
        System.out.println("India: " + nf_india.format(payment));
        System.out.println("China: " + nf_china.format(payment));
        System.out.println("France: " + nf_france.format(payment));
    }
}

