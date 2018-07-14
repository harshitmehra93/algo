package dynamic_programming;

public class TowersOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take input  of array and number of rotation.
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1);
		}
		int s = 11;
		s=s%arr.length;
		shiftRight(arr, s);
	}

	private static void shiftRight(int[] arr, int s) {
		int arr2[] = new int[s];
		for(int i=arr.length-s,j=0;i<arr.length;i++,j++) {
			arr2[j]=arr[i];
		}
		for(int i=arr.length-1;i>=s;i--) {
			int temp=arr[i];
			arr[i]=arr[i-s];
			arr[i-s]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
