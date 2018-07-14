package arrays;
import java.util.Scanner;
import java.util.HashMap;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("enter a string  :");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.println(checkUnique(input));
		//return flag;
		}
	}

	private static boolean checkUnique(String input) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charString = input.toCharArray();
		for(Character ch : charString) {
			if(map.containsKey(ch)) {
				return false;
			}
			map.put(ch, 1);
		}
		return true;
	}

}
