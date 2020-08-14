package Ocjp.basic;

import javax.swing.JButton;
import javax.swing.JFrame;
//A is a B이면 B가 상위(ex : Sonita is a Car) 
public class JButtonArray extends JFrame {
	//8번과 9번의 차이점은?
	String labels[] = {"조회","입력","삭제"};//값으로 초기화를 했다.
	JButton jbtns[] = new JButton[3];//선언만 했다
	//Default 생성자 선언
	//Default 생성자의 역할
	public JButtonArray() {
		initDisplay();
	}
	public JButtonArray(String title) {//생성자에서 메소드 호출은 가능한가?
		this.setTitle(title);
		initDisplay();
	}
	public JButtonArray(int height) {
		this.setSize(700, height);
		initDisplay();
	}
	public void initDisplay() {
		this.setSize(400, 300);//어디에 선언된 메소드?
		this.setVisible(true);//메소드 호출시 파라미터의 갯수
	}
	public static void main(String[] args) {
		new JButtonArray("생성자에 대해서...");//생성자를 호출하는 문장. ()안에 파라미터가 없으므로 파라미터가 없는 생성자를 호출.
		new JButtonArray(100);//생성자를 호출하는 문장. ()안에 파라미터가 없으므로 파라미터가 없는 생성자를 호출.
	}

}
