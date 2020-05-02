package pers.cb;
/*
 * 判断一个整数是否是回文数。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No9 nine = new No9();
		System.out.println(nine.isPalindrome(100));
	}
	public boolean isPalindrome(int x) {
		String str = x + "";
		if(str.length() % 2 == 0){
			//偶数长度
			int num1 = str.length() / 2;
			int num2 = str.length() / 2 - 1;
			for (int i = 0; i < str.length() / 2; i++) {
				if(str.charAt(num1) != str.charAt(num2)){
					return false;
				}
				num1++;
				num2--;
			}
			
		}else{
			//奇数个
			int num = (str.length() - 1) / 2;
			for (int i = 0; i < num + 1; i++) {
				if(str.charAt(num + i) != str.charAt(num - i)){
					return false;
				}
			}
			
		}
		return true;
    }
}
