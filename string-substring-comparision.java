

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String str = s;
        int d = k;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        if(str.length() < d)
            return "";

        smallest = str.substring(0, d);
        largest = str.substring(0, d);
        
        for(int i = 1; i <= str.length() - d; i++)
        {
            if(str.substring(i, i + d).compareTo(smallest) < 0)
                smallest = str.substring(i, i + d);
            if(str.substring(i, i + d). compareTo(largest) > 0)
                largest = str.substring(i, i + d);
        }
        

        return smallest + "\n" + largest;
    }

