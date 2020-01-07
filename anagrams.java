

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length())
            return false;

        int[] freqA = new int[100];
        int[] freqB = new int[100];

        for(int i = 0; i < a.length(); i++)
        {
            freqA[(int)(Character.toUpperCase(a.charAt(i)))] += 1;
        }

        for(int i = 0; i < b.length(); i++)
        {
            freqB[(int)(Character.toUpperCase(b.charAt(i)))] += 1;
        }
        

        int i = 0;

        while(i < 100)
        {
            if(freqA[i] != freqB[i])
                return false;
            i++;
        }

        return true;
    }

