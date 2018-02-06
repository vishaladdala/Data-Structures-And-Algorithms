import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String s = "{[]}";
		String ns = "{{{}{}[[]";
		System.out.println(IsValidParenthesis(s));
		System.out.println(IsValidParenthesis(ns));
	}
	
	public static boolean IsValidParenthesis(String exp){
		char[] str = exp.toCharArray();
		
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i<str.length; i++){
			if(map.keySet().contains(str[i])){
				stack.push(str[i]);
			}
			else if((!stack.empty()) && map.get(stack.peek())==str[i]){
				stack.pop();
			}
			else{
				return false;
			}
		}
		return stack.empty();
	}

}
