package book.ch2;

import javax.swing.JOptionPane;

public class EM {

	public static void main(String[] args) {
		//달의 중력은 지구중력의 17%에 불과합니다.
		//지구에서 몸무게가 100kg인  사람은 달에 가면 17kg밖에 안됩니다.
		//몸무게 N은 실수이고 키보드로 부터 입력받습니다.
		//출력결과
		//지구몸무게 100kg
		//달 몸무게 17kg
		
		String e = JOptionPane.showInputDialog("지구몸무게");
		String m = JOptionPane.showInputDialog("달 몸무게");
		System.out.println("지구몸무게 : "+Integer.parseInt(e)+"Kg");
		System.out.println("달 몸무게 : "+Integer.parseInt(m)+"Kg");

	}

}
