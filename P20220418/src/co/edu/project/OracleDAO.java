package co.edu.project;

public class OracleDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("Oracle 입력");
	}

	@Override
	public void update() {
		System.out.println("Oracle 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle 삭제");
	}

	@Override
	public void list() {
		System.out.println("Oracle 목록");
	}

}
