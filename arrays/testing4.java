package arrays;

import java.util.Scanner;
import java.util.HashMap;
public class testing4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("enter a string  :");
			Scanner in = new Scanner(System.in);
			String input1 = in.nextLine();
			
			boolean flag = CheckPalindromePermutation(input1);
			System.out.println(flag);
			//return flag;
		}
	}

	private static boolean CheckPalindromePermutation(String input1) {
		// TODO Auto-generated method stub
		if((input1.length()==0) || (input1.length()==1)) return true;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		input1=input1.trim();
		char[] charString1 = input1.toCharArray();
		for(int i=0;i<charString1.length;i++) {
			if(charString1[i]== ' ') {
				charString1[i]='\0';
			}
		}
		System.out.println(new String(charString1));
		//char[] charString2 = input2.toCharArray();
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
		int ones=0,one=0,space=0;
		for(Character k : map.keySet()) {
			int v = map.get(k);
			if(k=='\0'){
				space++;
			}else if(v==1) {
				one++;
			}else if(v%2!=0) {
				ones++;
			}
		}
		System.out.println("space"+space);
		if((one==1)&&(ones==0)) {
			return true;
		}else if((one==0)&&(ones==1)) {
			return true;
		}else if((one==0)&&(ones==0)) {
			return true;
		}
		
		return false;
	}

}
