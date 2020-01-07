

    Set<String> set = new HashSet<String>();

    for(int i = 0; i < t; i++)
    {
        set.add(pair_left[i].trim() + " " + pair_right[i].trim());

        System.out.println(set.size());
    }

