

        // Sort the array

       
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - 1 - i; j++)
            {
                if(((new BigDecimal(s[j])).compareTo(new BigDecimal(s[j+1]))) < 0)
                {
                    String m = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = m;
                }
            }
        }
        
