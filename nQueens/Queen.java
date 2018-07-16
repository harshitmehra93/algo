package nQueens;
import java.util.Scanner;
public class Queen {
	int row;
	int column;
	int id;
	Queen(int row, int column, int id){
		this.row=row;
		this.column=column;
		this.id=id;
	}
	@Override
	public String toString(){
		return new String("row "+this.row+" column :"+this.column+" id :"+this.id);
	}
}
