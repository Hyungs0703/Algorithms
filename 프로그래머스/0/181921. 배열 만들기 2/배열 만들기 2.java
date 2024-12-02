import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            if(String.valueOf(i).matches("[05]+")) {
                answer.add(i);
            } 
        }
        return answer.isEmpty() ? new int[]{-1} : 
                answer.stream().mapToInt(i -> i).toArray();
    }
}