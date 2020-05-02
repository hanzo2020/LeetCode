package pers.cb;

public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No8 eight = new No8();
		System.out.println(eight.myAtoi("-2147483648"));
		
	}
	public boolean isInt(char c){
		return c <='9' && c >= '0';
	}
	public int myAtoi(String str) {
		if(str.length() == 0){
			return 0;
		}
		int temp = 1;//正负
		StringBuilder s = new StringBuilder();
		int index = 0;
		while(true){
			if(str.charAt(index) == ' '){
				index++;
				if(index == str.length()){
					return 0;
				}
			}else{
				break;
			}
		}
		if(str.charAt(index) == '-' || str.charAt(index) == '+'){
			if(str.charAt(index) == '-'){
				temp = -temp;
				s.append('-');
			}
			index++;
			if(index == str.length()){
				return 0;
			}
		}
		if(!isInt(str.charAt(index))){
			return 0;
		}
		while(index < str.length()){
			if(!isInt(str.charAt(index))){
				break;
			}else{
				s.append(str.charAt(index));
				index++;
			}
			if(index < str.length() && isInt(str.charAt(index))){
				int x = Integer.parseInt(s.toString());
				if( x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE / 10 && (str.charAt(index) - '0') > Integer.MAX_VALUE % 10)){
					return Integer.MAX_VALUE;
				}
				//System.out.println(x * temp + "==" + Integer.MIN_VALUE / 10 + "||" + (str.charAt(index) - '0') + "==" + -(Integer.MIN_VALUE % 10) );
				if( x < Integer.MIN_VALUE / 10 || (x == Integer.MIN_VALUE / 10 && (str.charAt(index) - '0') > -(Integer.MIN_VALUE % 10))){
					return Integer.MIN_VALUE;
				}
			}
			
		}
		
		
		return Integer.parseInt(s.toString());
    }

}
