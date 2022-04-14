package cd.edu;

public class BoardList {
	private Board[] boards;
	
	//배열 크기 초기화	
	public void init(int size) {
		boards = new Board[size];
	}
	
	//배열에 한 건 입력.
	public int addBoard(Board board) {
		//더 이상 저장할 공간이 없다... false
		
		int errorCase = -1; // 저장 공간이 없음
		for (int i = 0; i < boards.length; i++) {
			if(boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; //중복 값이 있을시의 에러.
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;				
			}
		}		
		return errorCase;
	}
	
	//수정 : 게시글 번호로 검색하여 내용과 제목 변경 
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
	//삭제 : 게시글 번호로 검색하여 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				check = true;
				break;
			}
		}
		return check;
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
