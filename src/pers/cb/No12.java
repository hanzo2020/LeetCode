package pers.cb;

public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No12 twelve = new No12();
		System.out.println(twelve.intToRoman(231));
	}
	
	public String intToRoman(int num) {
        String[] str = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] arr = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        if(num == 0){
            return "";
        }
        int index = str.length - 1;
        for(;index >= 0;index --){
            if(num - arr[index] >= 0){
                return str[index] + intToRoman(num - arr[index]);
            }
        }
        return "";
    }
}
