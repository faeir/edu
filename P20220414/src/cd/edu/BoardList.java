package cd.edu;

public class BoardList {
	private Board[] boards;
	
	//배열 크기 초기화	
	public void init(int size) {
		boards = new Board[size];
	}
	
	//배열에 한 건 입력.
	public void addBoard(Board board) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;				
			}
		}		
	}
	
	//수정 : 게시글 번호로 검색하여 내용과 제목 변경 
	public void modifyBoard(Board board) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				break;
			}
		}
	}
	//삭제 : 게시글 번호로 검색하여 삭제
	public void removeBoard(int bNo) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				break;
			}
		}
	}
	//
	public Board searchBoard(int bNo) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt +  1);
				return boards[i];
				
			}
		}
		return null;
	}
	
	// 게시글목록
	public Board[] boardList() {
		return boards;
	}
}
