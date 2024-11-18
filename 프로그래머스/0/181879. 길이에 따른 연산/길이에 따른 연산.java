class Solution {
    public int solution(int[] num_list) {
        int result = (num_list.length <= 10) ? 1 : 0;
        
        for(int num : num_list) {
            if(num_list.length <= 10) {
                result *= num;
            } else {
                result += num;
            }
        }
        return result;
    }
}