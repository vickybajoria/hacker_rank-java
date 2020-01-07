import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for(int i = 0; i < q; i++)
        {
            switch(scan.next())
            {
                case "Insert":
                    list.add(scan.nextInt(), scan.nextInt());
                    break;
                case "Delete":
                    list.remove(scan.nextInt());
            }
        }

        for(Integer item: list)
        {
            System.out.print(item + " ");
        }
    }
}

