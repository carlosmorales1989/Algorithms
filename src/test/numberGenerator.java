package test;

public class numberGenerator {

	public static void main(String[] args) {
		int n = 3000;
		String s = ""+n;
		
		for (int i = 0; i < n; i++) {
			s+=" -"+(int)((Math.random()*2000)+1000);
		}
		System.out.println(s.length());
	}
	
}
