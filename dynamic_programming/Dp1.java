package dynamic_programming;
import java.util.*;
public class Dp1 {
	HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

	int findPossibleNumberOfWays(int n) {
		if(n==0) {
			this.hashMap.put(0, 1);
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(this.hashMap.containsKey(n)) {
			return this.hashMap.get(n);
		}else {
			int result = this.findPossibleNumberOfWays(n-1)+this.findPossibleNumberOfWays(n-2)+this.findPossibleNumberOfWays(n-3);
			this.hashMap.put(n, result);
			return result;
		}
	}
	public static void main(String[] args) {
		Dp1 obj = new Dp1();
		System.out.print(obj.findPossibleNumberOfWays(3));
	}
}



