

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder str = new StringBuilder();
            
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1] + 1;
            str.append(my_strings[i].substring(start, end));
        }
        return str.toString();
    }
}