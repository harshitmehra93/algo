
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testing = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("===="+test.maxSubArray(testing));
		    
		
	}
	public static int maxSubArray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
     
                max=Math.max(max,nums[j]-nums[i]);
                System.out.println(i+" + "+j+" = "+max);
            }
        }
        return max;
    }
}
