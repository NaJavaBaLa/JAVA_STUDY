package chapter08;

public class MySqlDao implements DataAccessObject {

	private String mysql = "MySql DB";

	@Override
	public void select() {
		System.out.println(mysql + "에서 검색 ");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(mysql + "에 삽입 ");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(mysql + "를 수정 ");
	}

	@Override
	public void delete() {
		System.out.println(mysql + "에서 삭제 ");
	}

}
