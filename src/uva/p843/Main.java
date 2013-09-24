package uva.p843;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static LinkedList[] dict;
	
	public static void main(String[] args) {
		Main.begin();
	}
	
	private static void begin(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		dict = new LinkedList[16];
		for (int i = 0; i < dict.length; i++) {
			dict[i] = new LinkedList<String>();
		}
		for (int i = 0; i < num; i++) {
			String ln = sc.nextLine();
			dict[ln.length()].add(ln);
		}
		
		while(sc.hasNextLine()){
			String ln = sc.nextLine();
			LinkedList<String> sentence = new LinkedList<String>();
			StringTokenizer st = new StringTokenizer(ln);
			while(st.hasMoreTokens()){
				sentence.add(st.nextToken());
			}						
		}
		
		
		
	}
	
	
	private HashMap<Character, Character> recurse(HashMap<Character, Character> currentMap,LinkedList sentence){
		
		
		return newMap;
		
	}
	
}
