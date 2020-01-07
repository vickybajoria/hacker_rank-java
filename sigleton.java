import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public static String str;
    
    static Singleton obj = null;
    
    private Singleton()
    {
    }
    
    public static Singleton getSingleInstance ()
    {
        if(obj == null)
            obj = new Singleton();
        return obj;
    }
}