package book.ch4;

import javax.swing.JOptionPane;
//모든 클래스 Object로 부터 상속받아서 만들어진다.
public class IFTest {

	public static void main(String[] args) {
		//사용자로부터 점수를 입력 받는다.
		//사용자가 입력한 점수를 담을 변수를 선언하세요.
		//사용자가 입력한 값을 받는 방법은 무엇입니까?
		//또 그 값을 받았을때 타입은 뭐죠?
		String i;
		i=JOptionPane.showInputDialog("점수를 입력하세요.");
		int j = Integer.parseInt(i);
		//if(Integer.parseInt(i)>=90) {
		if(j>=90) {
			System.out.println("A학점");
		}
		else if(j>=80){
			System.out.println("B학점");
		}
		else if(j>=70) {
			System.out.println("C학점");
		}
		else if(j>=60) {
			System.out.println("D학점");
		}
		else if(j>=50) {
			System.out.println("E학점");
		}
		else{
			System.out.println("F학점");
		}
			
		System.out.println(j+"점");
		
	}

}
