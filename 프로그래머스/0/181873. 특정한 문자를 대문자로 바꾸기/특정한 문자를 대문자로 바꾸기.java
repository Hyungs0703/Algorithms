class Solution {
    public String solution(String my_string, String alp) {
        return my_string.contains(alp) ? 
                my_string.replace(alp, alp.toUpperCase()) :
                my_string;
    }
}