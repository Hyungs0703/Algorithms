import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> num_list = new ArrayList<>();
        int num = n;
        
        while(num != 1) {
            num_list.add(num);
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
        }
        num_list.add(1);
        
        return num_list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}