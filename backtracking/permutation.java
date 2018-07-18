package backtracking;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class permutation {
	public static void main(String[] args) {
		permutation obj = new permutation();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		obj.permute(list, 0, 0);
	}
	
	public void permute(ArrayList<Integer> list,int i,int j) {
		if(i==list.size()-1) {
			this.printList(list);
		}else {
			for(j=i;j<list.size();j++) {
				this.swap(list,i,j);
				i++;
				this.permute(list, i, j);
				i--;
				this.swap(list,i,j);
			}
		}
	}

	private void printList(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
	}

	private void swap(ArrayList<Integer> list, int i, int j) {
		// TODO Auto-generated method stub
		int a = list.get(i);
		int b = list.get(j);
		list.set(i, b);
		list.set(j, a);
	}
}
