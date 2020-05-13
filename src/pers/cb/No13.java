package pers.cb;

public class No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No13 thirteen = new No13();
		String s = "MCMXCIV";
		System.out.println(thirteen.romanToInt(s));
	}

	public int romanToInt(String s) {
		if(s.length() == 0){
			return 0;
		}
		String[] str = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] arr = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int num = 0;
        int k = 0;
        s = s + " ";
        //两种情况，1种是一位代表一个数，一种是两位代表一个数
		while (k < s.length() - 1) {
			for (int i = str.length - 1; i >= 0; i--) {
				if (s.substring(k, k + 2).equals(str[i])) {
					num += arr[i];
					k += 2;
					break;
				} // 这是两位的
				if (s.substring(k, k + 1).equals(str[i])) {
					num += arr[i];
					k++;
					break;
				}
			}
		}
        return num;
    }
		
}
