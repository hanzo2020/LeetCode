package pers.cb;
/*
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
 */
public class No5 {
	public static void main(String[] args) {
		No5 n = new No5();
		String s = "asdasfsdsf";
		System.out.println(n.longerstStr(s));
	}
	
	
	public String longerstStr(String s){
		String lo = "";//最长
		int max = 0;
		int i = 0;
		int j = 0;
		for (i = 0;  i< s.length(); i++) {
			for (j = i+1; j <= s.length() ; j++) {
				String len = s.substring(i, j);
				if(len.length() > max && isOk(len) ){
					lo = len;
					max = lo.length();
				}
			}
		}
		
		return lo;
	}
	public boolean isOk(String s){
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if(s.charAt(i) != s.charAt(len - i -1)){
				return false;
			}
		}
		return true;
	}
}
