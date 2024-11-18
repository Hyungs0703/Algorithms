class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i : arr1) {
            sum1 += i;
        }
        
        for (int j : arr2) {
            sum2 += j;
        }
        
        if(arr1.length < arr2.length || arr1.length == arr2.length && sum1 < sum2) {
            return -1;
        } 
        if (arr2.length < arr1.length || arr2.length == arr1.length && sum2 < sum1) {
            return 1;
        } else {
            return 0;
        }
    }
}