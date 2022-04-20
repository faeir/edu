package co.edu.Board;

public class Board {
	
	//필드
	private int number;
	private String title;
	private String read;
	private String user;
	private String date;
	
	//생성자
	public Board(int number, String title, String read, String user, String date) {
		super();
		this.number = number;
		this.title = title;
		this.read = read;
		this.user = user;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "게시판 [글 번호 = " + number + ", 제목 = " + title + ", 내용 = " + read + ", 작성자 = " + user + ", 작성일시 = " + date
				+ "]";
	}
	
	

}
