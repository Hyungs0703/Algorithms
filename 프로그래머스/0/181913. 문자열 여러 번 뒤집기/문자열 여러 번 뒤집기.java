class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            reverseRange(answer, s, e);
        }
        return answer.toString();
    }
    
    private void reverseRange(StringBuilder sb, int start, int end) {
        sb.replace(start, end + 1,
                  new StringBuilder(sb.substring(start, end + 1))
                   .reverse()
                   .toString());
    }
}