
public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubarray obj = new MaxSubarray();
		System.out.println(obj.maxProfit(new int[] {7,1,5,3,6,4}));
	}
	int[] changes;
    public int maxProfit(int[] prices) {
        this.changes(prices);
        int[] result = this.findMaxSubarray(0,this.changes.length-1);
        return result[0];
    }
    private void changes(int[] prices) {
		// TODO Auto-generated method stub
    	int[] changes = new int[prices.length-1];
    	for(int i=0;i<prices.length-1;i++) {
    		changes[i]=prices[i+1]-prices[i];
    	}
    	this.changes=changes;
	}
	public int[] findMaxSubarray(int low, int high){
		System.out.println("====="+low+" "+high);
        if(low<high){
        	//System.out.println("=================");
            int mid = (low+high)/2;
        	//System.out.println(low+" = "+mid+" = "+high);
            System.out.println("leftStart"+mid);

            int[] resultLeft=this.findMaxSubarray(low,mid);
            System.out.println("leftComplete"+mid);
            int[] resultRight=this.findMaxSubarray((mid+1),high);
            int[] resultCross=this.findCross(low,mid,high);
            int[] result=findLargest(resultLeft,resultRight,resultCross);
            return result;
        }else {
        	System.out.println(low+" "+high);
            int[] result = {this.changes[low],low,high};
            return result;
        }
    }
    public int[] findLargest(int[] left, int[] right, int[] cross){
        int[] largest=left;
        if(left[0]<right[0]){
            largest=right;
        }
        if(largest[0]<cross[0]){
            largest=cross;
        }
        return largest;
    }
    public int[] findCross(int low,int mid,int high){
    	System.out.println(low+" ==cross== "+high);

        int maxLeft=-99999999,sum=0,left=low;
        for(int i=mid;i>=low;i--){
            sum=sum+this.changes[i];
            if(sum>maxLeft){
                maxLeft=sum;
                left=i;
            }
        }
        int maxRight=-99999999,right=high;
        sum=0;
        for(int i=mid+1;i<=high;i++){
            sum=sum+this.changes[i];
            if(sum>maxRight){
                maxRight=sum;
                right=i;
            }
        }
        int crossSum=maxRight+maxLeft;
        int largest=maxLeft;
        if(maxLeft>crossSum){
            return new int[]{maxLeft,left,mid};
        }else if(maxRight>crossSum){
            return new int[]{maxRight,mid+1,right};
        }else{
            return new int[]{crossSum,left,right};
        }
    }
}
