package co.edu.Board;

import java.util.ArrayList;

public interface BoardService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;

	public void addBoard(Board board);
	public void modBoard(Board board);
	public void delBoard(int number);
	public Board findUser(int number);
	public ArrayList<Board> listBoard(Board board);
	
	
}
