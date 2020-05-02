package pers.cb;
/*
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class No7 {
	public static void main(String[] args) {
		No7 seven = new No7();
		System.out.println(seven.reverse(3241431));
	}
	
	
	public int reverse(int x) {
		int temp1 = 0;//接受数字
		int temp2 = 0;//接受最终数字
		while(x != 0){
			temp1 = x % 10;
			x /= 10;
			if(temp2 == 214748364 && temp1 > 7 || temp2 > 214748364  ){
				return 0;
			}
			if(temp2 == -214748364 && temp1 < -8 || temp2 < -214748364  ){
				return 0;
			}
			temp2 = temp2 * 10 + temp1;
			
		}
		
		return temp2 ;
	}
}
