package book.ch2;
/*
 * 대입연산자 오른쪽에 있는 값을 왼쪽에 대입한다.
 * 주의사항
 * 작은 값은 더 큰 타입에 대입하는건 합법
 * 그러나 큰 타입을 작은 타입의 변수에 대입하는건 불법.
 */
public class D {

	public static void main(String[] args) {
		int i = 1;//정수타입
		double d = i;//정수타입을 실수에 대입
		//i = d;//실수타입은 정수타입에 대입불가
		i = (int)d;//강제 형전환
		float f = 1.5f;
		i =(int)f;
		float f1 = (float)d;
		System.out.println("f1 : "+f1);
	}

}
