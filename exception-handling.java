import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try
        {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a / b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass().getName());
        }
    }
}

