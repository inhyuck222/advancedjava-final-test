package test;

public class PasswordDismatchException extends Exception {
	
	public PasswordDismatchException() {
		super("비밀번호가 틀렸습니다");
	}

}
