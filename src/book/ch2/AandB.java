package book.ch2;
/*
 * 학습목표
 * - 나는 변수를 선언할 수 있다.[핵심 키워드 - 구분]
 * - 나는 클래스 안에서 변수와 메소드를 구분하여 말할 수 있다.[핵심 키워드 - 구분]
 * - 나는 선언한 변수에 적당한 값으로 초기화를 할 수 있다.[핵심 키워드 - 초기화]
 * - 나는 초기화의 위치가 결과값에 어떠한 영향을 주는지 설명할 수 있다.[핵심 키워드 - 위치]
 */
public class AandB {

	public static void main(String[] args) {
		int a;
		a=5;//정수타입의 변수 a에 5를 담았다.
		int b;//정수 타입의 변수 b를 선언하였다. 그러나 초기화는 아직...
		b=a;//변수 b에 a를 대입하였다. 여기서 =는 오른쪽과 왼쪽에 있는 값이 같다는게 아니라 오른쪽에 있는 값을 왼쪽에 대입해 주세요 이다.
		a=10;
		System.out.println("변수 a는"+a+"입니다.");
		System.out.println("변수 a는"+b+"입니다.");
	}

}
