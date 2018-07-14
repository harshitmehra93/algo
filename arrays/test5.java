package arrays;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("enter a string  :");
			Scanner in = new Scanner(System.in);
			String input1 = in.nextLine();
			
			System.out.println("enter another string  :");
			String input2 = in.nextLine();	
			boolean flag = checkStrings(input1,input2);
			System.out.println(flag);
			//return flag;
		}
	}

	private static boolean checkStrings(String input1, String input2) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(input1.length()<input2.length()) {
			if(input2.length()-input1.length()>1) {
				return false;
			}
			flag=checkInsertionOrDeletion(input2,input1);
		}else if(input1.length()>input2.length()) {
			if(input1.length()-input2.length()>1) {
				return false;
			}
			flag=checkInsertionOrDeletion(input1,input2);
		}else {
			flag=checkReplacement(input1,input2);
		}
		return flag;
	}

	private static boolean checkReplacement(String input1, String input2) {
		// TODO Auto-generated method stub
		char[] charString1=input1.toCharArray(),charString2=input2.toCharArray();
		int conflicts =0;
		for(int i=0;i<charString1.length;i++) {
			if(charString1[i]!=charString2[i]) {
				conflicts++;
			}
			if(conflicts>1) {
				return false;
			}
		}
		if(conflicts<2) {
			return true;
		}else {
			return false;
		}
	}

	private static boolean checkInsertionOrDeletion(String larger, String smaller) {
		// TODO Auto-generated method stub
		char[] charString1=larger.toCharArray(),charString2=smaller.toCharArray();
		int conflicts =0;
		for(int i=0,j=0;i<charString1.length;i++,j++) {
			if(j==charString2.length) {
			if(charString1[i]!=charString2[j]) {
				System.out.println(charString1[i]+"   "+charString2[j]);
				conflicts++;
				if(conflicts>1) {
					return false;
				}
				j--;
			}
			
		}
		if(conflicts<2) {
			return true;
		}else {
			return false;
		}
	}
}
