package pers.cb;

import java.util.ArrayList;
import java.util.List;

/*
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
	给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class No17 {

	public static void main(String[] args) {
		No17 se = new No17();
		String digits = "23";
		System.out.println(se.letterCombinations(digits));

		
	}
	List<String> let = new ArrayList<String>();
	String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public List<String> letterCombinations(String digits) {
		if(digits == null || digits.length() == 0){
			return new ArrayList<>();
		}
		letter(digits,"",0);
		return let;
		
    }
	public void letter(String digits,String str,int index){
		if(index == digits.length()){
			let.add(str);
			return;
		}
		char c = digits.charAt(index);
		int k = c - '0';
		String strs = map[k];
		for (int i = 0; i < strs.length(); i++) {
			letter(digits,str + strs.charAt(i),index + 1);
			//letter(digits,str + strs.charAt(i),++index);
		}
		
	}


}
