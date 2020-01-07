import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List< List<Integer> > arr_2d = new ArrayList< List<Integer> >();

        //  Read 2-D Array
        for(int i = 0; i < n; i++)
        {
            int d = scan.nextInt();

            List<Integer> arr_1d = new ArrayList<Integer>();
            for(int  j = 0; j < d; j++)
            {
                arr_1d.add(scan.nextInt());
            }
            arr_2d.add(arr_1d);
        }

        int q = scan.nextInt();

        for(int i = 0; i < q; i++)
        {
            int row = scan.nextInt();
            int col = scan.nextInt();

            try
            {
                System.out.println(arr_2d.get(row - 1).get(col - 1));
            }
            catch(IndexOutOfBoundsException ex)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

