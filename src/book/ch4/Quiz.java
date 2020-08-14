package book.ch4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quiz {
/*0~9사이의 임의의 숫자를 고르고
 *그 숫자를 맞추는 게임을 작성하시오.
 */
	
	public static void main(String[] args) {
		Random rd= new Random();
		int i=rd.nextInt(10);
		String x=JOptionPane.showInputDialog("0에서 9까지의 숫자를 입력하세요.");
		int y = Integer.parseInt(x);
		if(i==y) {
			System.out.println("정답! "+i);
			
		}
		else if(0>y||y>10||y==10) {
			System.out.println("0에서 9까지의 숫자를 입력해주세요.");	
		}
	
		else{
			System.out.println("오답! 정답은 "+i);	
			System.out.println("내가 선택한 숫자는 "+y);	
		}
	}

}
