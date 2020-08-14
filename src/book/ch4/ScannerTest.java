package book.ch4;

import java.util.Scanner;

//모든 클래스는 Object클래스를 상속받고있다
//그래서 Object에 정의된 메소드는 모두 내가 사용할 수 있다.
public class ScannerTest {

	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		for(i=1;i<4;i++) {
			System.out.println("숫자를 입력하세요.");
			String num = scan.nextLine();
			System.out.println("num===>"+num);
			
		}
//for문 안에서 선언된 변수는 for문 안에서만 사용할 수 있다.
	}

}
