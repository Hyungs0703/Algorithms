class Solution {
    public int solution(String binomial) {
        String[] op = binomial.split(" ");
        int num1 = Integer.parseInt(op[0]);
        String oper = op[1];
        int num2 = Integer.parseInt(op[2]);
        
        switch(oper) {
            case "+": 
                return num1 + num2;
            case "-": 
                return num1 - num2;
            case "*": 
                return num1 * num2;
            case "/": 
                return num1 / num2;
        }
          
        return 0;
    }
}