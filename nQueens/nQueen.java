package nQueens;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class nQueen{
	boolean[] rows;
	boolean[] columns;
	boolean[] leftDiagnol;
	boolean[] rightDiagnol;
	int boardSize;
	int counter=0;
	LinkedList<Queen> queens;
	public nQueen(int boardSize) {
		// TODO Auto-generated constructor stub
		this.rows = new boolean[boardSize];
		this.columns = new boolean[boardSize];
		this.leftDiagnol = new boolean[boardSize*2-1];
		this.rightDiagnol = new boolean[boardSize*2-1];
		this.initializeToTrue();
		
		this.boardSize=boardSize;
		this.queens = new LinkedList<Queen>();
		this.counter=0;
	}

	private void initializeToTrue() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.rows.length;i++) {
			this.rows[i]=true;
			this.columns[i]=true;
		}
		for(int i=0;i<this.leftDiagnol.length;i++) {
			this.leftDiagnol[i]=true;
			this.rightDiagnol[i]=true;			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter board size: ");
		Scanner in = new Scanner(System.in);
		int boardSize = in.nextInt();
		nQueen obj = new nQueen(boardSize);
		try {
		obj.placeQueen(0);
		}catch(Exception e) {
			System.out.println("Finished");
		}
		System.out.println(obj.queens.size());
	}

	private void placeQueen(int row) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(this.counter++);
		for(int column=0;column<this.boardSize;column++) {
			//System.out.println("====");
			if(this.isPositionAvailable(row,column)) {
				//System.out.println("====");
				Queen queen = new Queen(row,column,row);
				//System.out.println(queen);
				this.queens.add(queen);
				this.updatePositions(row,column,false);
				
				if(row==this.boardSize-1) {
					Iterator<Queen> it = this.queens.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					throw new Exception();
				}else {
					try {
					this.placeQueen(row+1);
					}catch(Exception e) {
						throw new Exception();
					}
				}
				this.updatePositions(row, column, true);
				this.queens.removeLast();
			}
		}
		
	}

	private void updatePositions(int row, int column, boolean flag) {
		// TODO Auto-generated method stub
		this.rows[row]=flag;
		this.columns[column]=flag;
		this.leftDiagnol[row-column+this.boardSize-1]=flag;
		this.rightDiagnol[row+column]=flag;
	}

	private boolean isPositionAvailable(int row, int column) {
		// TODO Auto-generated method stub
		if(this.rows[row]&&this.columns[column]&&this.leftDiagnol[row-column+this.boardSize-1]&&this.rightDiagnol[row+column]) {
			return true;
		}else {
			return false;
		}
	}


	
}