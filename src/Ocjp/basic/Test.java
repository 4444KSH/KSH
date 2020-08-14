package Ocjp.basic;

public class Test {

	public static void main(String[] args) {
		int x =5;
		boolean b1 = true;
		boolean b2 = false;
		
		if((x==4) && !b2)//false&&true
			System.out.print("1 ");//if에서 중괄호를 생략하면 첫번째 호출만 실행(true일 경우 실행됨)
		System.out.print("2 ");//if와 상관없는 호출이다.
		if ((b2 = true) && b1)//false=>true
		System.out.print("3 ");//

	}

}
