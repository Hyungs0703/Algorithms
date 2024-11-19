import java.util.*;

class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            answer.append(ch1[i]);
            answer.append(ch2[i]);
        }
        
        return answer.toString();
    }
}