package pers.cb;
/*
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 */

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class No6 {

	public static void main(String[] args) {
		No6 six = new No6();
		String ss = "LEETCODEISHIRING";
		
		System.out.println(six.convert(ss, 3));
	}
	public String convert(String s, int numRows) {
		if(numRows < 2){
			return s;
		}
		List<StringBuilder> rows = new ArrayList<StringBuilder>();
		for (int i = 0; i < numRows; i++) {
			rows.add(new StringBuilder());
		}
		int k = 0;
		int temp = -1;
		for (int j = 0; j < s.length(); j++) {
			rows.get(k).append(s.charAt(j));
			
			if(k == 0 || k == numRows - 1){
				temp *= -1;
			}
			k += temp;
		}
		StringBuilder str = new StringBuilder();
		for (StringBuilder stringBuilder : rows) {
			str.append(stringBuilder);
		}
		
		return str.toString();
    }

}
