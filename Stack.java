import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<Character>();
        int i = 0;
		
		while (sc.hasNext()) {
			String input=sc.next();
            
            // travel the input string, for each input, do the following:
            // 1. if cur is {, [, (, push it into stack
            // 2. if cur is not the one, pop from stack, see if it is 
            // corresponding opening parathesis, if stack is non empty
            // 3. one string is empty, make sure stack is empty
            
            i = 0;
            stk.clear();
            while(i < input.length())
            {
                char cur = input.charAt(i);
                if( (cur == '{') || (cur == '(') || (cur == '[') )
                {
                    // Its opening
                    stk.push(cur);
                }
                else
                {
                    // Its closing
                    if(stk.empty()) break;
                    char c = stk.pop();

                    if(c == '{' && cur != '}') break;
                    if(c == '(' && cur != ')') break;
                    if(c == '[' && cur != ']') break;
                }
                i++;
            }

            if(i < input.length() || !stk.empty())
                System.out.println("false");
            else
            {
                System.out.println("true");
            }
		}
		
	}
}



