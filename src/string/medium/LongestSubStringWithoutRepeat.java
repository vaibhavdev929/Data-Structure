package string.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeat {

    public static int getSubString(String s)
    {
        List<Character> listItem = new ArrayList<>();
        int highest =0;
        for(int i =0 ; i<s.length(); i++)
        {
            if(listItem.contains(s.charAt(i)))
            {
                if(listItem.size()>highest)
                {
                    highest = listItem.size();
                }
                listItem.clear();
            }

            listItem.add(s.charAt(i));
        }
        return highest;
    }
}
