package pers.cb;

public class No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No10 ten = new No10();
		String s = "aab";
		String p = "a*b";
		System.out.println(ten.isMatch(s, p));
	}
	public boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            return s.isEmpty();
        }
        boolean isSame = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if(p.length() >= 2 && p.charAt(1) == '*'){
            return (isSame && isMatch(s.substring(1),p)) || isMatch(s,p.substring(2));
        }else if(isSame){
            return isMatch(s.substring(1),p.substring(1));
        }else{
            return false;
        }
    }

}
