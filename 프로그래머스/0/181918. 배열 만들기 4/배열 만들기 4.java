import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int num : arr) {
            while(!stk.isEmpty() && stk.get(stk.size() - 1) >= num) {
                stk.remove(stk.size() - 1);
            }
            stk.add(num);
        }
        
        return stk.stream()
                    .mapToInt(i -> i)
                    .toArray();
        
    }
}