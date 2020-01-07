import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add
{
    void add(int ... a)
    {
        String s = new String();
        int sum = 0;
        int cur = 0;
    
        for(int i: a)
        {
            s += i;
            sum += i;

            if(cur < a.length - 1)
                s += '+';
            
            cur++;
        }

        
            s += "=";
        

        System.out.println(s + sum);
    }
}

