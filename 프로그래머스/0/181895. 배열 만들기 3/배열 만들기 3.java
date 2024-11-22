import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> num_list = new ArrayList<>();
       
        for(int[] interval : intervals) {
            for(int i = interval[0]; i <= interval[1]; i++) {
                num_list.add(arr[i]);
            }
           
        }
        return num_list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}