import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static boolean flag;
static int B;
static int H;

static
{
    Scanner scan = new Scanner(System.in);
    try 
    {
        B = scan.nextInt();
        H = scan.nextInt();

        if(B <= 0 || H <= 0)
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        
        flag = true;
    }
    catch(Exception e)
    {
        System.out.print(e.getMessage());
        flag = false;
    }
}



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

