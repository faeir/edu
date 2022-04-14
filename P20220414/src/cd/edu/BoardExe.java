package cd.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// BoardList에 정의해 놓은 필드와 메소드를 활용해서 기능.
		BoardList boardList = new BoardList();
		boardList.init(5);
		
		while (true) {
			
			System.out.println("1.추가 | 2.수정 | 3.목록 | 4.삭제 | 5.한 건 조회 | 9.종료");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				System.out.print("글번호 입력> ");
				int bNo = scn.nextInt();
				
				System.out.print("제목 입력> ");
				String bTitle = scn.next();
				
				System.out.print("내용 입력> ");
				String bContent = scn.next();
				
				System.out.print("작성자 입력> ");
				String bWriter = scn.next();
				Board newBod = new Board(bNo, bTitle, bContent, bWriter);
				boardList.addBoard(newBod);
				
			} else if (menu == 2) {
				System.out.println("수정할 글 번호 >");
				int bNo = scn.nextInt();
				System.out.println("수정할 글 제목 >");
				String title = scn.next();
				System.out.print("수정할 내용 입력> ");
				String content = scn.next();
				Board cBoard = new Board(bNo, title, content, null);
				
				boardList.modifyBoard(cBoard);
				
			} else if (menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호  제목         내용           사용자  조회수");
				System.out.println("================================================");
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("삭제할 글 번호 >");
				int bNo = scn.nextInt();
				boardList.removeBoard(bNo);
				
			} else if (menu == 5) {
				System.out.println("검색할 글 번호 >");
				int bNo = scn.nextInt();
				Board getBoard = boardList.searchBoard(bNo);
				getBoard.getDetailInfo();
				
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;				
			} else {
				System.out.println("정확한 메뉴를 선택하세요");
			}				
		}
		System.out.println("프로그램 종료");
	}		
}