package scr;

public class TestFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letters= {'a','b','c','b','a','d','e','o','c'};
		int[] count=new int[26];
		for(int i=0;i<letters.length;i++) {
			count[letters[i]-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.println((char)(i+'a')+":"+count[i]);
			}
		}
	}

}
