package BaseBallGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class BaseBallGameView extends JFrame {
//  Main2 m = new Main2(this);
//  BaseBallGame_View bbg = new BaseBallGame_View()
//	BaseBallLogic bbl = new BaseBallLogic();
//	BaseBallGameEvent bbge = new BaseBallGameEvent(this, bbl);
	BaseBallGameEvent bbge = null;
	public BaseBallGameView(BaseBallGameEvent bbge) {
		this.bbge = bbge;
	}
	JPanel jp_center = new JPanel();
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 숫자와 숫자를
	JScrollPane jsp_display =null;
	JTextArea jta_display = null;
	JTextField jtf_user = new JTextField();
	//글꼴의 스타일과 글자 크기를 정해줌. - 인스턴스화를 통해서 그 값들은 생성자의 파라미터로 결정됨.
	Font f = new Font("Thoma",Font.BOLD,14);
	//동쪽에 들어갈 속지 생성하기
	JPanel jp_east = new JPanel();
	//새게임, 정답, 지우기, 나가기 버튼 추가하기
	JButton jbtn_new   = new JButton("새게임");
	JButton jbtn_dap   = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit  = new JButton("나가기");
	//이미지를 담은 물리적인 위치 선언하기
	//String imgPath="C:\\workspace_java\\dev_java\\src\\Game\\BaseBall\\";
	//ImageIcon titleIcon = new ImageIcon(imgPath+"yagu.jpg");
	//ImageIcon bg = new ImageIcon(imgPath+"yagu.jpg");
	//Image img = this.getToolkit().getImage(imgPath+"yagu.jpg");
	//이미지 버튼을 만드는데 필요한 클래스 선언하기
	//JButton jbtn_inew = new JButton();
	//JMenuBar클래스를 활용하여 JFrame에 메뉴바를 구성할 수 있다.
	JMenuBar jmb=new JMenuBar();
	//JMenuBar에 추가할 JMenu를 생성한다.
	JMenu 	  jm_file   =new JMenu("File");
	//JMenu에 들어갈 하위 메뉴에 들어갈 아이템을 생성하기(New, Open, Exit)
	JMenuItem jmi_new   =new JMenuItem("새게임");
	JMenuItem jmi_dap  =new JMenuItem("정답");
	JMenuItem jmi_clear  =new JMenuItem("지우기");
	JMenuItem jmi_exit  =new JMenuItem("나가기");
	JMenu 	  jm_info   =new JMenu("Info");
	JMenuItem jmi_help   =new JMenuItem("도움말");
	JMenuItem jmi_creator =new JMenuItem("제작자");
	JToolBar toolbar 	= new JToolBar();
	
public void  initDisplay() {
  System.out.println("호출 성공");
	jta_display = new JTextArea() {
	//public void paint(Graphics g) {
		//g.drawImage(img,0,0,null);
		//Point p=jsp_display.getViewport().getViewPosition();
		//g.drawImage(img, 0, 0, null);
		//paintComponent(g);
		//}
	};
	jsp_display = new JScrollPane(jta_display);
	jsp_display = new JScrollPane(jta_display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			 		, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	System.out.println("intiDisplay 호출성공");
	//jf.setContentPane(new BgPanel());
	//메뉴바에 들어갈 이미지 버튼 추가
		//jbtn_inew.setIcon(new ImageIcon(imgPath+"new.gif"));
		//toolbar.add(jbtn_inew);
	//메뉴바 구성하기 시작//
			jm_file.add(jmi_new);
			jm_file.add(jmi_dap);
			jm_file.add(jmi_clear);
			jm_file.add(jmi_exit);
			jm_info.add(jmi_help);
			jm_info.add(jmi_creator);
			jm_file.setMnemonic('F');
			jm_info.setMnemonic('I');
			jmb.add(jm_file);
			jmb.add(jm_info);
			//메뉴바 구성하기 끝//
	//이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
	jtf_user.addActionListener(bbge);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame 안에 atcionPerformed 필요
	jbtn_new.addActionListener(bbge);
	jbtn_dap.addActionListener(bbge);
	jbtn_clear.addActionListener(bbge);
	jbtn_exit.addActionListener(bbge);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame 안에 atcionPerformed 필요
	jbtn_new.setBackground(new Color(0,0,255));
	jbtn_new.setForeground(new Color(255,255,255));
	jbtn_dap.setBackground(new Color(255,0,255));
	jbtn_dap.setForeground(new Color(255,255,255));
	jbtn_clear.setBackground(new Color(255,0,0));
	jbtn_clear.setForeground(new Color(255,255,255));
	jbtn_exit.setBackground(new Color(0,0,0));
	jbtn_exit.setForeground(new Color(255,255,255));
	jbtn_exit.addActionListener(bbge);
	jmi_exit.addActionListener(bbge);		
	jp_east.setLayout(new GridLayout(4,1));
	jp_east.add(jbtn_new);
	jp_east.add(jbtn_dap);
	jp_east.add(jbtn_clear);
	jp_east.add(jbtn_exit);
	jta_display.setFont(f);
	jta_display.setBackground(new Color(255,255,0));
	jta_display.setForeground(new Color(0,0,255));
	jtf_user.setBackground(new Color(0,255,255));
	jp_center.setBackground(Color.blue);
	jp_center.setBackground(Color.blue);
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기 위한 힌트문을
	//출력해줄 화면.
	jp_east.setBackground(Color.yellow);
	jp_center.setLayout(new BorderLayout());
	jp_center.add("Center",jsp_display);
	jp_center.add("South",jtf_user);
	//jta_display.setLineWrap(true);
	this.setLayout(new BorderLayout(2,2));
	this.add("North",toolbar);
	this.add("Center",jp_center);
	this.add("East",jp_east);
	this.setTitle("야구 숫자 게임 Ver1.0");
	this.setJMenuBar(jmb);
	this.setSize(400, 300);
	this.setVisible(true);

	}
}