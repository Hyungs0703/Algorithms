import java.util.stream.*;

class Solution {
    public int solution(int[][] arr) {
        boolean answer = IntStream.range(0, arr.length)
            .allMatch(i -> IntStream.range(0, arr.length)
                     .allMatch(j -> arr[i][j] == arr[j][i]));
        
        return answer ? 1 : 0;
    }
}