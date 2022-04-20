package co.edu.Board;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService bbs = new BoardApp();

		while (true) {
			System.out.println("1.글 작성 | 2.글 수정 | 3.글 삭제 | 4. 게시글 검색 | 5.전체 글 목록 | 6.종료");
			System.out.println("원하는 메뉴의 번호를 선택해주세요 >");
			int num = 0;
			while (true) {
				try {
					num = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					 scn.nextLine();
					System.out.println("숫자를 입력해주세요");
				}
			}
			if (num == BoardService.ADD) {
				int number = 0;
				while (true) {
				try {
					System.out.println("새로운 글을 작성합니다");
					System.out.print("글 번호를 입력해주세요 > ");
					number = scn.nextInt();
					break;
				} catch (InputMismatchException e1) {
					scn.nextInt();
					System.out.println("글 번호는 숫자만 입력해주세요");
					}
				}
				System.out.print("글 제목을 입력해주세요 > ");
				String title = scn.next();

				System.out.print("내용을 입력해주세요 > ");
				String read = "";
				while(true) {
					String temp = scn.next();
					if(temp.equals("작성완료")) {
						break;
					} 
					read += temp + " ";
				}
				

				System.out.print("작성자 > ");
				String user = scn.next();

				System.out.print("작성일시 > ");
				String date = scn.next();

				Board board = new Board(number, title, read, user, date);
				bbs.addBoard(board);
				System.out.println("새로운 게시글이 작성되었습니다");

			} else if (num == BoardService.MOD) {
				System.out.print("내용을 수정하고 싶은 글의 번호 >");
				int cNumber = scn.nextInt();
				System.out.print("내용을 수정해주세요 > ");
				String cRead = scn.next();
				Board board = new Board(cNumber, null, cRead, null, null);
				bbs.modBoard(board);
				System.out.println("내용이 수정되었습니다");

			} else if (num == BoardService.DEL) {
				System.out.print("삭제 하고자 하는 글의 번호 >");
				int dNumber = scn.nextInt();
				bbs.delBoard(dNumber);

			} else if (num == BoardService.SEARCH) {
				System.out.print("내용을 조회하고 싶은 글의 번호 >");
				int fNumber = scn.nextInt();
				bbs.findUser(fNumber);

			} else if (num == BoardService.LIST) {
				System.out.println("모든 게시글 목록을 출력합니다");
				System.out.println("===========================================================");
				ArrayList<Board> list = bbs.listBoard(null);
				for (Board board : list) {
					System.out.println(board.toString());
				}
				System.out.println("===========================================================");
			} else {
				System.out.println("게시판을 떠납니다");
				break;
			}

		}

	}

}
