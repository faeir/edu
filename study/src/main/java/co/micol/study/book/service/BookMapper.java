package co.micol.study.book.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.study.book.vo.BookVO;

public interface BookMapper {
	List<BookVO> BookSelectList();
	List<BookVO> BookSearchList(@Param("key") String key, @Param("val") String val); //2개 이상의 값을 넘기고 싶을때
	BookVO bookSelect(BookVO vo);
	int bookInsert(BookVO vo);
	int bookUpdate(BookVO vo);
	int bookDelete(BookVO vo);
	//int noticeHitUpdate(int id); //조회수 증가 메소드
}
