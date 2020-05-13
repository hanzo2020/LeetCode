package pers.cb;

public class No14 {

	public static void main(String[] args) {
		No14 fourteen = new No14();
		String[] strs = {"flower","flow","flight"};
		String[] strs2 = {"aa","aaaaa"};
		System.out.println(fourteen.longestCommonPrefix(strs2));
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0){
			return "";
		}
		String s = strs[0];
		for (int i = 1; i < strs.length; i++) {
			for (int j = 0; j < s.length() && j < strs[i].length() ; j++) {
				if(strs[i].equals("")){
					return "";
				}
				if(s.charAt(j) != strs[i].charAt(j)){
					s = s.substring(0, j);
					break;
				}
				if(j + 1 == strs[i].length()){
					s = s.substring(0,j + 1);
					break;
				}
			}
			if(s.equals("")){
				return "";
			}
		}
		return s;
    }
	

}
