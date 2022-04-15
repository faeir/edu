package cd.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// BoardList에 정의해 놓은 필드와 메소드를 활용해서 기능.
		BoardList boardList = new BoardList();
		boardList.init(5);
		
		while (true) {
			//6번 작성자 조회
			System.out.println("1.추가 | 2.수정 | 3.목록 | 4.삭제 | 5.한 건 조회 | 6.작성자 조회 | 9.종료");
			System.out.print("선택> ");
			int menu = -1;
			try {
				menu = scn.nextInt(); //입력한 숫자값을 반환
			} catch(InputMismatchException e) {
				System.out.println("잘못된 처리 실행");
			}
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
				int chk = boardList.addBoard(newBod);
				if (chk == 0) {
					System.out.println("입력되었습니다");
				} else if (chk == -1) {
					System.out.println("저장 공간이 없습니다.");
				} else if (chk == 1) {
					System.out.println("이미 사용 중인 공간입니다.");
				}
				
			} else if (menu == 2) {
				System.out.println("수정할 글 번호 >");
				int bNo = scn.nextInt();
				System.out.println("수정할 글 제목 >");
				String title = scn.next();
				System.out.print("수정할 내용 입력> ");
				String content = scn.next();
				Board cBoard = new Board(bNo, title, content, null);
				if (boardList.modifyBoard(cBoard)) {
					System.out.println("수정되었습니다");
				} else {
					System.out.println("수정에 실패했습니다.");
				}	
				
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
				
				if(boardList.removeBoard(bNo)) {
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("삭제되지 않았습니다.");
				}
								
				
			} else if (menu == 5) {
				System.out.println("검색할 글 번호 >");
				int bNo = scn.nextInt();
				Board getBoard = boardList.searchBoard(bNo);
				if (getBoard == null) {
					System.out.println("조회 결과가 없습니다.");
				} else {
					getBoard.getDetailInfo();
				}
			} else if (menu == 6) { // 작성자
				System.out.println("작성자의 이름 >");
				String sWriter = scn.next();
				Board[] writerList = boardList.searchWriter(sWriter);
				// writerList 내용 출력
				System.out.println("게시글번호  제목         내용           사용자  조회수");
				System.out.println("================================================");
				for (Board board : writerList) {
					if (board != null) {
						board.getInfo();
					}				
				}
			}
			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;				
			} else {
				System.out.println("정확한 메뉴를 선택하세요");
			}				
		}
		System.out.println("프로그램 종료");
	}
}