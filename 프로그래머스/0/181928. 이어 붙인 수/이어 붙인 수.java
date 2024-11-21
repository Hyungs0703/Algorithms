class Solution {
    public int solution(int[] num_list) {
        StringBuilder num = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        for(int i : num_list) {
            if(i % 2 == 0) {
                num.append(i); 
            } else {
                num2.append(i);
            }
        }
        return Integer.parseInt(num.toString()) + Integer.parseInt(num2.toString());
    }
}