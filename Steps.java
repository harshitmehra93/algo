import java.util.HashMap;
public class Steps {
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		int n=50;
		System.out.println(Steps.countSteps(n));
	}

	private static int countSteps(int n) {
		if(map.containsKey(n)) {
			return map.get(n);
		}else {
			int ways=0;
			if(n==0) {
				map.put(0, 1);
				return 1;
			}else if(n==1) {
				ways=Steps.countSteps(0);
				map.put(n, ways);
				return ways;
			}else if(n==2) {
				ways=Steps.countSteps(1)+Steps.countSteps(0);
				map.put(n, ways);
				return ways;
			}else if(n==3) {
				ways=Steps.countSteps(2)+Steps.countSteps(1)+Steps.countSteps(0);
				map.put(n, ways);
				return ways;
			}else {
				ways=Steps.countSteps(n-3)+Steps.countSteps(n-2)+Steps.countSteps(n-1);
				map.put(n, ways);
				return ways;
			}
		}
	}
}
