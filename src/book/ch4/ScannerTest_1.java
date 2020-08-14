package book.ch4;

import java.util.Scanner;

//모든 클래스는 Object클래스를 상속받고있다
//그래서 Object에 정의된 메소드는 모두 내가 사용할 수 있다.
public class ScannerTest_1 {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		while(i<4) {
			System.out.println("숫자를 입력하세요.");
			String num = scan.nextLine();
			System.out.println("num===>"+num);
			i++;
			
		}
//for문 안에서 선언된 변수는 for문 안에서만 사용할 수 있다.
	}

}
