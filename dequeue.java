    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            Set set = new HashSet();  // For storing unique element of the current window
            int n = in.nextInt();
            int m = in.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();

                // Process each window for uniqueness. Store window in deque
                deque.add(num);
                set.add(num);

                if(deque.size() == m)
                {
                    // check for maximum disctinct element in deque
                    if(set.size() > max)
                        max = set.size();
                    
                    // So, in the current window I got the maximum distince element
                    // now move the window
                    Object first = deque.remove();

                    // Check whether we can keep this element in set or not
                    // if it is a unique element then we have to remove this  element from set also
                    if(!deque.contains(first))
                    {
                        set.remove(first);
                    }
                }
               
            }
            System.out.print(max);
        }
    }



