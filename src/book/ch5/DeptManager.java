package book.ch5;

import javax.swing.JButton;
import javax.swing.JFrame;
//오늘부터는 되도록 메인 메소드에 코딩을 하지 않는다.
//한번에 어렵다면 조금씩 줄여본다.
//생성자는 의존관계를 실제로 표현할 수 있다.(허용할 수 있다.) - 클래스 쪼개기 연습시 꼭 활용해볼 것.
//static은 사용하지 말 것.
//while문 i=i++; break; for문안에 break;
//반드시 무한루프 방지코드를 작성할 것.
public class DeptManager extends JFrame {
	int deptno;
	JButton jbtn_center = new JButton();
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
						  //Default 생성자는 생략할 수 있다.
	public DeptManager() {//전역변수의 초기화를 대신해줌.
		System.out.println("Default 생성자 1");
	}
	public DeptManager(int deptno) {//Default 생성자는 생략할 수 있다.
		this.deptno = deptno;
		deptno=30;
		System.out.println("Default 생성자 2");
		initDisplay();
	}
	void methodA() {
		System.out.println("methodA에서 "+deptno);
	}
	public void initDisplay() {
		jbtn_center.setText("중앙");
		this.add("Center",jbtn_center);
		this.add("North",jbtn_north);
		this.add("South",jbtn_south);
		this.add("East",jbtn_east);
		this.add("West",jbtn_west);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);//오리지널 자바 스킨
		//new DeptManager();
		new DeptManager(10);		
		//DeptManager dt1=new DeptManager();
		//DeptManager dt2=new DeptManager(10);
	}

}
