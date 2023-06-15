package exceptionTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionTest3 {

	//throws : 예외 던지기
	//throws 예외클래스명(던질 예외명)
	void throwMethod() throws IOException {
		PrintWriter out = null;
		
		//해당 코드는 반드시 예외처리를 해야한다
		//1. try-catch 블록으로 예외처리
		//2. throws 키워드 사용하기(예외 던지기)
		out = new PrintWriter(new FileWriter("file.txt"));
	}
	
	public static void main(String[] args) {

		ExceptionTest3 et = new ExceptionTest3();
		//해당 메서드를 사용하는곳에서 예외처리를 진행한다
		try {
			et.throwMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
