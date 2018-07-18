package sorting;

public class MergeSort {
	int[] array;
	public void mergeSort(int p,int q){
		if(p<q) {
			int r=(p+q)/2;
			this.mergeSort(p, r);
			this.mergeSort(r+1, q);
			this.merge(p,r,q);
		}
	}
	private void merge(int p, int r, int q) {
		// TODO Auto-generated method stub
		//System.out.println(p+" "+r+" "+q);
		int len1 = r-p+1;
		int len2 = q-r;
		int[] left = new int[len1];
		int[] right = new int[len2];
		int[] result = new int[len1+len2];
		for(int i=p,j=0;i<=r;i++,j++) {
			left[j]=this.array[i];
		}
		for(int i=r+1,j=0;i<=q;i++,j++) {
			right[j]=this.array[i];
		}
		int i=0,j=0,k=0;
		while(i<len1||j<len2) {
			if(i==len1&&j==len2) {
				break;
			}
			if(i==len1) {
				result[k]=right[j];
				j++;
				k++;
				continue;
			}
			if(j==len2) {
				result[k]=left[i];
				i++;
				k++;
				continue;
			}
			if(left[i]<right[j]) {
				result[k]=left[i];
				i++;
				k++;
			}else {
				result[k]=right[j];
				j++;
				k++;
			}
		}
		for(i=p,j=0;i<=q;i++,j++) {
			this.array[i]=result[j];
		}
		
	}
	public static void main(String[] args) {
		int[] array = new int[] {5,1,7,4,9,2,3};
		MergeSort obj = new MergeSort();
		obj.array=array;
		obj.mergeSort(0, array.length-1);
		for(int i:obj.array) {
			System.out.print(i+" ");
		}
	}
}
