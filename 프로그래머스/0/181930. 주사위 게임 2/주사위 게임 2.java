class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int sumSquare = a * a + b * b + c * c;
        int sumCube = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {  
            return sum * sumSquare * sumCube;
        } else if (a == b || b == c || a == c) {  
            return sum * sumSquare;
        } else {  
            return sum;
        }
    }
}
