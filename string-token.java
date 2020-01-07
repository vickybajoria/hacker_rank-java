import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] token = s.split("[ !,?._'@]+");

        if((token.length != 0) && token[0].length() == 0)
            token = Arrays.copyOfRange(token, 1, token.length);

        System.out.println(token.length);

        for(String str: token)
        {
            System.out.println(str);
        }


        scan.close();
    }
}

