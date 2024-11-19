import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> str = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            str.add(my_string.substring(i));
        }
        Collections.sort(str);
        
        return str.toArray(new String[0]);
    }
}