class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        char[] c = code.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    answer.append(c[i]);
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}