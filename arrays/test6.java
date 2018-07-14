package arrays;

import java.util.Scanner;

	public class test6 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true) {
			System.out.println("enter a string  :");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			
			System.out.println(compress(input));
			//return flag;
			}
		}
		private static String compress(String input) {
			char[] charString = input.toCharArray();
			char previous=charString[0];
			StringBuilder result = new StringBuilder();
			Integer count=0;
			for(int i=1;i<charString.length;i++) {
				if(previous==charString[i]) {
					count++;
				}else {
					if(count==0) {
						result.append(previous);
					}else {
						count++;
						result.append(previous+count.toString());
						count=0;
					}
					previous=charString[i];
				}
			}
			//to handle last element
			if(count==0) {
				result.append(charString[charString.length-1]);
			}else {
				count++;
				result.append(charString[charString.length-1]+count.toString());
			}
			if(result.length()==input.length()) {
				return input;
			}else {
				return result.toString();
			}
		}
}
