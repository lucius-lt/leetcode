// Last updated: 7/16/2026, 1:12:38 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' || c=='{'||c=='[') stack.push(c);
            else if (c==')'){
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            else if(c=='}'){
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
            else if(c==']'){
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}