package Ocjp.basic;

public class Q12 {

	public static void main(String[] args) {
		int x = 5;  //main에서 선언된 지역변수
		//Q12 p = null;//선언만 됨 - 이 주소번지를 사용하면 NullPointException이 발생(Runtime에러)
		Q12 p = new Q12();
		p.doStuff(x);//13번 메소드 호출
		System.out.print(" main x = "+ x);//5
		}//end of main
		
		void doStuff(int x) {//타입이 붙어있으므로 지역변수, int x는 main 메소드의 x값을 대입
		System.out.print(" doStuff x = "+ x++);//5
		}//end of doStuff 10번으로 돌아간다.

}//end of Q12
