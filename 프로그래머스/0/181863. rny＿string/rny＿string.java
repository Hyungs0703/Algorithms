class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder(); 
        char[] charArray = rny_string.toCharArray(); 

        for (char s : charArray) {
            if (s == 'm') { 
                answer.append("rn");
            } else { 
                answer.append(s);
            }
        }

        return answer.toString(); 
    }
}
