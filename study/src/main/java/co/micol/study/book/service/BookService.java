package co.micol.study.book.service;

import java.util.List;

import co.micol.study.book.vo.BookVO;

public interface BookService {
	List<BookVO> BookSelectList();
	List<BookVO> BookSearchList(String key, String val);
	BookVO bookSelect(BookVO vo);
	int bookInsert(BookVO vo);
	int bookUpdate(BookVO vo);
	int bookDelete(BookVO vo);
	//int noticeHitUpdate(int id); //조회수 증가 메소드
}
