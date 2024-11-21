import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return n % 2 == 1 ? 
            IntStream.rangeClosed(1, n)                        
                        .filter(i -> i % 2 == 1)
                        .sum() 
            :
            IntStream.rangeClosed(2, n)
                        .filter(i -> i % 2 == 0)
                        .map(i -> i * i)
                        .sum();
    }
}