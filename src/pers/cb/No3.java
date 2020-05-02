package pers.cb;

public class No3 {

	public static void main(String[] args) {
		No3 lon = new No3();
		int x = lon.Longest("assfgd");
		System.out.println(x);

	}
	public int Longest(String s){
		String[] k = new String[s.length()];
		int head = 0;//队列头
		int longest = 0;
		
		for (int i = 0; i < k.length; i++) {
			k[i] = s.charAt(i) + "";
			for (int j = head; j < i; j++) {
				if(k[j].equals(k[i])){
					head = j + 1;
				}
			}
			if((i + 1 - head) > longest){
				longest = i + 1 - head;
			}
		}
		
		
		
		return longest;
	}
}
