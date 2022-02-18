package CoreJava.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
//		duplicateChar();
		dupStr();
		
	}
	public static void dupStr() {
		String str = "Wasim is wasima now ";
		str = str.replace(" ", "");
		
	    char[] ch = str.toCharArray();  // string to char Array 
	    
		
		for(int i = 0 ; i < str.length() ; i++)  // string index 
		{
			for (int j = i+1 ; j < str.length() ; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+" ");
					break;
				}
			}
		}
		
	}
	
	public static void duplicateChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		str = str.replace(" ", "");
		
		char[] ch = str.toCharArray();
	
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {
			if(map.containsKey(c)) 
				map.put(c, map.get(c)+1);
			else 
				map.put(c, 1);
		}
		for(Map.Entry<Character , Integer> entery :map.entrySet()) {
			if(entery.getValue()>1) {
				System.out.println(entery.getKey()+  " :  "+entery.getValue());
			}
		}
		
	}

}
