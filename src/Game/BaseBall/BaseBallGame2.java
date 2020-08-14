package Game.BaseBall;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * 이벤트 처리 3단계
 * 1.JTextField가 지원하는 이벤트 처리 담당 클래스를 implements 한다.
 * 2.1번에서 추가된 이벤트 처리 담당 클래스가 선언하고 있는 actionPerformed 메소드를 재정의 해야함.
 * 3.이벤트 소스(이벤트 처리 대상 클래스의 주소번지)와 이벤트 처리를 담당하는 클래스를 연결하기
 */
public class BaseBallGame2 implements ActionListener {
	//중앙에 들어갈 속지 선언
	JPanel jp_center = new JPanel();
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 숫자와 숫자를
	JTextArea jta_display = new JTextArea();
	JTextField jtf_user = new JTextField();
	JScrollPane jsp_display = new JScrollPane(jta_display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
														 , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	//글꼴의 스타일과 글자 크기를 정해줌. - 인스턴스화를 통해서 그 값들은 생성자의 파라미터로 결정됨.
	Font f = new Font("Thoma",Font.BOLD,14);
	//동쪽에 들어갈 속지 생성하기
	JPanel jp_east = new JPanel();
	//새게임, 정답, 지우기, 나가기 버튼 추가하기
	JButton jbtn_new   = new JButton("새게임");
	JButton jbtn_dap   = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit  = new JButton("나가기");
	
	//JMenuBar클래스를 활용하여 JFrame에 메뉴바를 구성할 수 있다.
	JMenuBar jmb=new JMenuBar();
	//JMenuBar에 추가할 JMenu를 생성한다.
	JMenu 	  jm_file   =new JMenu("File");
	//JMenu에 들어갈 하위 메뉴에 들어갈 아이템을 생성하기(New, Open, Exit)
	JMenuItem jmi_new   =new JMenuItem("New");
	JMenuItem jmi_open  =new JMenuItem("Open");
	JMenuItem jmi_exit  =new JMenuItem("Exit");
	JMenu 	  jm_edit   =new JMenu("Edit");
	JMenuItem jmi_copy  =new JMenuItem("Copy");
	JMenuItem jmi_cut   =new JMenuItem("Cut");
	JMenuItem jmi_paste =new JMenuItem("Paste");
	
	//나가기 버튼이나 나가기 메뉴 아이템을 선택했을때 호출되는 메소드 구현
	public void exit(){//0은 자바 가상머신과의 연결고리를 끊는다
		System.exit(0);
	}
	//화면을 그려주는 메소드 선언

	public void initDisplay() {
		//메뉴바 구성하기 시작//
				jm_file.add(jmi_new);
				jm_file.add(jmi_open);
				jm_file.add(jmi_exit);
				jm_edit.add(jmi_copy);
				jm_edit.add(jmi_cut);
				jm_edit.add(jmi_paste);
				jm_file.setMnemonic('F');
				jm_edit.setMnemonic('E');
				jmb.add(jm_file);
				jmb.add(jm_edit);
				//메뉴바 구성하기 끝//
				System.out.println("intiDisplay 호출성공");
				//EventHandler ehandler = new EventHandler();
				jtf_user.addActionListener(this);
				jbtn_exit.addActionListener(this);
		//이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
		jtf_user.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame 안에 atcionPerformed 필요
		jbtn_new.setBackground(new Color(0,0,255));
		jbtn_new.setForeground(new Color(255,255,255));
		jbtn_dap.setBackground(new Color(255,0,255));
		jbtn_dap.setForeground(new Color(255,255,255));
		jbtn_clear.setBackground(new Color(255,0,0));
		jbtn_clear.setForeground(new Color(255,255,255));
		jbtn_exit.setBackground(new Color(0,0,0));
		jbtn_exit.setForeground(new Color(255,255,255));
		jp_east.setLayout(new GridLayout(4,1));
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		jta_display.setFont(f);
		jta_display.setBackground(new Color(255,255,0));
		jta_display.setForeground(new Color(0,0,255));
		JFrame jf = new JFrame();
		jtf_user.setBackground(new Color(0,255,255));
		jp_center.setBackground(Color.blue);
		jp_center.setBackground(Color.blue);
		//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기 위한 힌트문을
		//출력해줄 화면.
		jp_east.setBackground(Color.yellow);
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center",jsp_display);
		jp_center.add("South",jtf_user);
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(2,2));
		jf.add("Center",jp_center);
		jf.add("East",jp_east);
		jf.setTitle("야구 숫자 게임 Ver1.0");
		jf.setJMenuBar(jmb);
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();

	}
	//jtf_user에 엔터를 쳤을 때, jbtn_exit버튼을 클릭했을때 이벤트 지원하는 인터페이스가 ActionListener이다.
	//ActionListener는 반드시 ActionPerformed를 재정의 해야한다.
	//java에서는 @을 annotation라고 읽는다.
	//annotation - 부모가 가진 메소드를 재정의 하였다는 의미.
	//콜백메소드는 개발자가 호출할 수 없는 메소드로 시스템 레벨에서 필요할 때 자동으로 호출됨.
	//자바에 main메소드도 일종의 콜백 메소드.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출 성공");
		if(e.getSource()==jtf_user){
			jta_display.append(jtf_user.getText()+"\n");
			jtf_user.setText("");
		
		}
		
	}

}
