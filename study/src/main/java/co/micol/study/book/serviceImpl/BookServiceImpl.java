package co.micol.study.book.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.study.book.service.BookMapper;
import co.micol.study.book.service.BookService;
import co.micol.study.book.vo.BookVO;
import co.micol.study.comm.DataSource;

public class BookServiceImpl implements BookService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BookMapper map = sqlSession.getMapper(BookMapper.class);
	
	@Override
	public List<BookVO> BookSelectList() {
		return map.BookSelectList();
	}

	@Override
	public List<BookVO> BookSearchList(String key, String val) {
		return map.BookSearchList(key, val);
	}

	@Override
	public BookVO bookSelect(BookVO vo) {
		return map.bookSelect(vo);
	}

	@Override
	public int bookInsert(BookVO vo) {
		return map.bookInsert(vo);
	}

	@Override
	public int bookUpdate(BookVO vo) {
		return map.bookUpdate(vo);
	}

	@Override
	public int bookDelete(BookVO vo) {		
		return map.bookDelete(vo);
	}

}
