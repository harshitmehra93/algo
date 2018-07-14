package arrays;

import java.util.Scanner;
import java.util.HashMap;
public class testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("enter a string  :");
			Scanner in = new Scanner(System.in);
			String input1 = in.nextLine();
			
			System.out.println("enter another string  :");
			String input2 = in.nextLine();			
			System.out.println(checkPermutation(input1,input2));
			//return flag;
		}
	}

	private static boolean checkPermutation(String input1, String input2) {
		// TODO Auto-generated method stub
		if(input1.length()!=input2.length()) {
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charString1 = input1.toCharArray();
		char[] charString2 = input2.toCharArray();
		
		for(Character ch : charString1) {
			if(map.containsKey(ch)) {
				
				map.put(ch, (map.get(ch)+1));
				System.out.println(ch+" "+map.get(ch));
			}else {
				map.put(ch, 1);
				System.out.println(ch+" =  "+map.get(ch));
			}
		}	
		System.out.println("===========");
		for(Character ch : charString2) {
			if(!map.containsKey(ch)) {
				return false;
			}else {
				if(map.get(ch)==0) {
					return false;
				}else {
					System.out.println(ch+" "+map.get(ch));
					map.put(ch, (map.get(ch)-1));
					System.out.println(ch+" "+map.get(ch));
				}
			}
		}
		return true;
	}

}
