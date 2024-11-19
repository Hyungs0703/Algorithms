import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] first = Arrays.copyOfRange(num_list, 0, n);
        int[] second = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] answer = new int[num_list.length];
        
        System.arraycopy(second, 0, answer, 0, second.length);
        System.arraycopy(first, 0, answer, second.length, first.length);
        return answer;
    }
}