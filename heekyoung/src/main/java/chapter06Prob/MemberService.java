package chapter06Prob;

public class MemberService {
	private String id = "hong";
	private String password = "12345";

	public boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String string) {
		System.out.println("로그아웃 되었습니다.");
	}
}
