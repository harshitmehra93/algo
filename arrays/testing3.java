package arrays;

import java.util.Scanner;

public class testing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("enter a string  :");
			Scanner in = new Scanner(System.in);
			String input1 = in.nextLine();			
			System.out.println(Urlify(input1));
			//return flag;
		}
	}

	private static String Urlify(String input1) {
		// TODO Auto-generated method stub
		String input2 = input1.trim();
		char[] charString = input2.toCharArray();
		int spaceCounter=0;
		for(int i=0;i<charString.length;i++) {
			if(charString[i]==' ') {
				spaceCounter++;
			}
		}
		char[] result = new char[(charString.length+2*spaceCounter)];
		for(int i=result.length-1,j=charString.length-1;i>=0;i--,j--) {
			if(charString[j]==' ') {
				result[i]='0';
				i--;
				result[i]='2';
				i--;
				result[i]='%';
			}else {
				result[i]=charString[j];
			}
		}
		
		return new String(result);
	}

}
