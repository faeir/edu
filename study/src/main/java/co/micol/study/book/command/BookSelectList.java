package co.micol.study.book.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.study.book.service.BookService;
import co.micol.study.book.serviceImpl.BookServiceImpl;
import co.micol.study.book.vo.BookVO;
import co.micol.study.comm.Command;

public class BookSelectList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 목록
		BookService dao = new BookServiceImpl();
		List<BookVO> books = new ArrayList<BookVO>();
		books =  dao.BookSelectList();
		request.setAttribute("books", books);
		return "book/bookSelectList";
	}

}
