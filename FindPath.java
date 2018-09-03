import java.util.ArrayList;
public class FindPath {
	int n=5;
	int[][] grid = {{0,0,0,-1,0},{0,-1,0,0,-1},{0,0,-1,0,-1},{-1,0,-1,0,-1},{0,0,-1,0,0}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPath obj=new FindPath();
		obj.findPath(0, 0);
		obj.printGrid();
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.
	}
	
	public boolean findPath(int i, int j) {
		if((j==n)||(i==n)) {
			return false;
		}else if(grid[i][j]==-1) {

			return false;
		}else if(i==(n-1)&&j==(n-1)) {
			grid[i][j]=3;
			return true;
		}else {
			grid[i][j]=3;
			if(this.findPath(i+1, j)==false&&this.findPath(i, j+1)==false) {

				grid[i][j]=0;
				return false;
			}else {
				return true;
			}
		}
	}
	public void printGrid() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(grid[i][j]+"\t");
			}
			System.out.println();
		}
	}



