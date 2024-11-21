import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> str = new ArrayList<>();
                
        for(String s : strArr) {
            if(!s.contains("ad")) {
                str.add(s);
            }
        }
        return str.toArray(new String[0]);
    }
}