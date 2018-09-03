package finalprep;

public class Quicksort {
	public static void main(String[] args) {
		int[] array = new int[] {6,9,2,7,4,10,1,3};
		quicksort(array,0,array.length-1);
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void quicksort(int[] array, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r) {
			int q=partition(array,p,r);
			quicksort(array,p,q-1);
			quicksort(array,q+1,r);
		}
	}

	private static int partition(int[] array, int p, int r) {
		// TODO Auto-generated method stub
		int i=p-1;
		int pivot=array[r];
		for(int j=p;j<r;j++) {
			if(array[j]<pivot) {
				i++;
				int tmp=array[j];
				array[j]=array[i];
				array[i]=tmp;
			}
		}
		i++;
		int tmp=pivot;
		array[r]=array[i];
		array[i]=tmp;
		return i;
	}
}
