import java.util.Stack;

class RemovePair{
    public int solution(String s){
        Stack<Character> ss = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(ss.isEmpty()) ss.push(c);
            else if(ss.peek() == c) ss.pop();
            else ss.push(c);
        }
        
        return ss.isEmpty() ? 1 : 0;
    }
}