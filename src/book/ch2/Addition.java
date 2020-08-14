package book.ch2;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		//사용자에 의한 첫번째 문자열 입력
		String firstNumber="5";
		firstNumber = JOptionPane.showInputDialog("첫번째 숫자 입력하세요.");
		String secondNumber="10";
		secondNumber = JOptionPane.showInputDialog("제곱할 숫자 입력하세요.");
		int number1;//첫번째 숫자 추가
		int number2;//두번째 숫자 추가
		int sum;//number1과 number2 더하기
		//사용자 스트링으로 부터 첫번째 숫자 읽기
		number1=Integer.parseInt(firstNumber);
		number2=Integer.parseInt(secondNumber);
		sum = number1+number2;
		int math = (int)Math.pow(number1, number2);
		System.out.println(firstNumber);
		System.out.println(firstNumber+5);//문자+숫자=문자
		System.out.println(sum);
		//결과를 나타내기
		JOptionPane.showMessageDialog(null, "The Math.pow is "+math, "처리 결과", JOptionPane.INFORMATION_MESSAGE);
		//자바 가상 머신과의 연결고리를 끊어버림.
		System.exit(0);
	}

}
