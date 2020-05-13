package pers.cb;
/*
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：


	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。


注意空字符串可被认为是有效字符串。
 */
import java.util.Stack;

public class No20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((";
		System.out.println(isValid(s));
	}
	public static boolean isT(char i,char j){
		if(i == ')' && j == '('){
			return true;
		}else if(i == ']' && j == '['){
			return true;
		}else if(i == '}' && j == '{'){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isValid(String s) {
		if(s.length() % 2 != 0){
			return false;
		}
		Stack stack1 = new Stack();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				stack1.push(s.charAt(i));
				continue;
			}else if(stack1.isEmpty() || !isT(s.charAt(i),(char)stack1.peek())){
				return false;
			}
			stack1.pop();
		}
		if(stack1.isEmpty()){
			return true;
		}
		return false;
		
    }

}
