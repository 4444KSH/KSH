package Game.BaseBall;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BaseBallGame3 {
	JFrame    jf	       = new JFrame();//기본틀
	JPanel    jp_center    = new JPanel();//센터 속지
	JPanel    jp_east      = new JPanel();//버튼삽입용 속지
	JButton   jbtn_new	   = new JButton("새게임");//버튼1
	JButton   jbtn_dap	   = new JButton("정답");//버튼2
	JButton   jbtn_clear   = new JButton("지우기");//버튼3
	JButton   jbtn_exit	   = new JButton("나가기");//버튼4
	JMenuBar  jmb	  	   = new JMenuBar();//메뉴바
	JMenu 	  jm_file	   = new JMenu("파일");//메뉴항목1
	JMenuItem jmi_new  	   = new JMenuItem("새게임");//메뉴항목1에 들어갈 메뉴버튼1
	JMenuItem jmi_dap  	   = new JMenuItem("정답");//메뉴항목1에 들어갈 메뉴버튼2
	JMenuItem jmi_clear    = new JMenuItem("지우기");//메뉴항목1에 들어갈 메뉴버튼3
	JMenuItem jmi_exit     = new JMenuItem("나가기");//메뉴항목1에 들어갈 메뉴버튼4
	JMenu 	  jm_info	   = new JMenu("정보");//메뉴항목2
	JMenuItem jmi_help     = new JMenuItem("도움말");//메뉴항목2에 들어갈 메뉴버튼5
	JMenuItem jmi_creator  = new JMenuItem("제작자");//메뉴항목2에 들어갈 메뉴버튼6
	
	
	public void initDisplay() {
		JFrame    jf       = new JFrame();//기본틀
		jf.add("Center",jp_center);//JFrame에 센터속지 삽입(중앙위치)
		//jf.setLayout(new BorderLayout());
		//jp_center.setLayout(new BorderLayout());
		jf.add("East",jp_east);//JFrame에 버튼삽입용 속지 삽입(동쪽위치)
		jp_east.add(jbtn_new);//버튼용속지에 버튼1 삽입
		jp_east.add(jbtn_dap);//버튼용속지에 버튼2 삽입
		jp_east.add(jbtn_clear);//버튼용속지에 버튼3 삽입
		jp_east.add(jbtn_exit);//버튼용속지에 버튼4 삽입
		jp_east.setLayout(new BorderLayout());
		jp_east.setLayout(new GridLayout(4,1));
		//jf.add(jmb);//JFrame에 메뉴바 삽입<<이러면 JFrame 중간에 메뉴바가 삽입된다. 
		jf.setJMenuBar(jmb);//JFrame 상단 메뉴바위치에 메뉴바 삽입
		jmb.add(jm_file);//메뉴바에 메뉴항목1 삽입
		jm_file.add(jmi_new);//메뉴항목1에 메뉴버튼1 삽입
		jm_file.add(jmi_dap);//메뉴항목1에 메뉴버튼2 삽입
		jm_file.add(jmi_clear);//메뉴항목1에 메뉴버튼3 삽입
		jm_file.add(jmi_exit);//메뉴항목1에 메뉴버튼4 삽입
		jmb.add(jm_info);//메뉴바에 메뉴항목2 삽입
		jm_file.add(jmi_help);//메뉴항목2에 메뉴버튼5 삽입
		jm_file.add(jmi_creator);//메뉴항목2에 메뉴버튼6 삽입
		jf.setTitle("야구숫자게임");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		BaseBallGame3 bbg3 = new BaseBallGame3();
		bbg3.initDisplay();
	}

}
