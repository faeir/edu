package co.edu.Board;

import java.util.ArrayList;

public class BoardApp implements BoardService {

	ArrayList<Board> boards = new ArrayList<Board>();
	@Override
	public void addBoard(Board board) {
		boards.add(board);
	}

	@Override
	public void modBoard(Board board) {
		for (int i = 0; i < boards.size(); i++)
			if (boards.get(i).getNumber() == board.getNumber()) {
				boards.get(i).setRead(board.getRead());
			}
	}

	@Override
	public void delBoard(int number) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNumber() == number) {
				boards.remove(i);
			}
		}
	}

	@Override
	public Board findUser(int number) {
		for (int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getNumber() == number) {
				System.out.println(boards.get(i));
				break;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Board> listBoard(Board board) {
		ArrayList<Board> list = new ArrayList<Board>();
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i) == null) {
				System.out.println("작성된 게시글이 없습니다");
			}
			list.add(boards.get(i));
		}
		return list;
	}

}
