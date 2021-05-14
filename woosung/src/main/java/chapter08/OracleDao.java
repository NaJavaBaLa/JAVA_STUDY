package chapter08;

public class OracleDao implements DataAccessObject {

	private String oracle = "Oracle DB";

	@Override
	public void select() {
		System.out.println(oracle + "에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(oracle + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(oracle + "를 수정 ");
	}

	@Override
	public void delete() {
		System.out.println(oracle + "에서 삭제 ");
	}

}
