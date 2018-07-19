package sorting;

public class QuickSort {
	int[] array;
	void quickSort(int p,int r) {
		if(p<r) {
			int q = this.partition(p,r);
			this.quickSort(p, q-1);
			this.quickSort(q+1, r);
		}
	}
	private int partition(int p, int r) {
		// TODO Auto-generated method stub
		int i=p-1;
		int j=p;
		int key=this.array[r];
		for(;j<r;j++) {
			if(this.array[j]<key) {
				int tmp=this.array[j];
				i++;
				this.array[j]=this.array[i];
				this.array[i]=tmp;
			}
		}
		i++;
		int tmp=this.array[r];
		this.array[r]=this.array[i];
		this.array[i]=tmp;
		return i;
	}
	public static void main(String[] args) {
		int[] array = new int[] {5,1,7,4,9,2,3};
		QuickSort obj = new QuickSort();
		obj.array=array;
		obj.quickSort(0, array.length-1);
		for(int i:obj.array) {
			System.out.print(i+" ");
		}
	}
}
