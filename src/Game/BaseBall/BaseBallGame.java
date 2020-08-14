package Game.BaseBall;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
/*
 * 이벤트 처리 3단계
 * 1.JTextField가 지원하는 이벤트 처리 담당 클래스를 implements 한다.
 * 2.1번에서 추가된 이벤트 처리 담당 클래스가 선언하고 있는 actionPerformed 메소드를 재정의 해야함.
 * 3.이벤트 소스(이벤트 처리 대상 클래스의 주소번지)와 이벤트 처리를 담당하는 클래스를 연결하기
 */
public class BaseBallGame implements ActionListener {
	JFrame jf = new JFrame();
	//중앙에 들어갈 속지 선언
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
	String imgPath="C:\\workspace_java\\dev_java\\src\\Game\\BaseBall\\";
	//ImageIcon titleIcon = new ImageIcon(imgPath+"yagu.jpg");
	//ImageIcon bg = new ImageIcon(imgPath+"yagu.jpg");
	Image img = jf.getToolkit().getImage(imgPath+"yagu.jpg");
	//이미지 버튼을 만드는데 필요한 클래스 선언하기
	JButton jbtn_inew = new JButton();
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
	//세자리 임의의 숫자를 채번하는 메소드 구현하기
	int my[] = new int[3];
	int com[] = new int[3];
	int cnt = 1;//cnt++
	/* 배경 이미지 구현
	class BgPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.drawImage(bg.getImage(), 0,0,null);
			setOpaque(false);
			super.paintComponent(g);
		}
	}
	*/
	public void ranCom() {
		com[0]=(int)(Math.random()*10);
		do {
			com[1]=(int)(Math.random()*10);	
		}while(com[0]==com[1]);
		do {
			com[2]=(int)(Math.random()*10);	
		}while(com[2]==com[1]||com[2]==com[0]);
	}
	//사용자가 입력한 값을 판정하는 메소드를 구현하기.
	public String account(String user) {
		//사용자가 jtf_user에 입력한 숫자는  숫자처럼 보이지만 사실 문자이다.
		//그래서 형전환을 한 후 my[]배열에 담아야 한다.
		//문자열 "256"을 담을 변수 선언
		int t=0;
		int s=0;//힌트로 사용될 스트라이크를 담을 변수 선언
		int b=0; //볼을 담을 변수 선언
		//strike와 ball을 지역변수로 해야하는 이유는 매 회차 마다 값이 변해야 하기 때문.
		try {
			t = Integer.parseInt(user);
		} catch(NumberFormatException e) {
			return "그러지마...";
		}
		t = Integer.parseInt(user);
		my[0] = t/100;
		my[1] = (t%100)/10;
		my[2] = t%10;		
		JOptionPane.showMessageDialog(null, my[0]+""+my[1]+""+my[2]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(my[i]==com[j]) {//너 안에 내가 가진 숫자가 있는가?
					if(i==j) //그러면 자리까지도 일치하는가?
						s++;//실행문이 하나일때는 {}생략가능
					else b++;					
				}
			}
		}
		if(s==3) {
			return "왤캐 천재임?";
		}
		return s+" Strike "+b+" Ball"; 
		
	}
	//나가기 버튼이나 나가기 메뉴 아이템을 선택했을때 호출되는 메소드 구현
	public void exit(){//0은 자바 가상머신과의 연결고리를 끊는다
		System.out.println("exit호출 성공");
		System.exit(0);
	}
	//화면을 그려주는 메소드 선언

	public void initDisplay() {
		jta_display = new JTextArea() {
		public void paint(Graphics g) {
			g.drawImage(img,0,0,null);
			Point p=jsp_display.getViewport().getViewPosition();
			g.drawImage(img, 0, 0, null);
			paintComponent(g);
			}
		};
		jsp_display = new JScrollPane(jta_display);
		jsp_display = new JScrollPane(jta_display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
				 		, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		System.out.println("intiDisplay 호출성공");
		//jf.setContentPane(new BgPanel());
		//메뉴바에 들어갈 이미지 버튼 추가
			jbtn_inew.setIcon(new ImageIcon(imgPath+"new.gif"));
			toolbar.add(jbtn_inew);
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
		jtf_user.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame 안에 atcionPerformed 필요
		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame 안에 atcionPerformed 필요
		jbtn_new.setBackground(new Color(0,0,255));
		jbtn_new.setForeground(new Color(255,255,255));
		jbtn_dap.setBackground(new Color(255,0,255));
		jbtn_dap.setForeground(new Color(255,255,255));
		jbtn_clear.setBackground(new Color(255,0,0));
		jbtn_clear.setForeground(new Color(255,255,255));
		jbtn_exit.setBackground(new Color(0,0,0));
		jbtn_exit.setForeground(new Color(255,255,255));
		jbtn_exit.addActionListener(this);
		jmi_exit.addActionListener(this);		
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
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(2,2));
		jf.add("North",toolbar);
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
		bbGame.ranCom();
		System.out.println(bbGame.com[0]+""+bbGame.com[1]+""+bbGame.com[2]);
		//System.out.println("For문으로 테스트하기");
		//10번 확인하고 싶은 경우
		/*for(int i=0;i<10;i++) {
			bbGame.ranCom();//해당 메소드를 호출하지 않으면 반복값이 똑같이 나온다.
			System.out.println(bbGame.com[0]+" "+bbGame.com[1]+" "+bbGame.com[2]);
		
		}*/
		//String result=bbGame.account("256");
		//System.out.println("result::"+result);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출 성공");
		String label =  e.getActionCommand();
		System.out.println("당신이 누른 버튼의 문자열은 "+label+" 입니다.");
		Object obj = e.getSource();//이벤트소스의 주소번지를 담아줌.
		if("나가기".equals(label)) {
		//if(obj==jbtn_exit||obj==jmi_exit) {
		
			exit();
		}
		else if(e.getSource()==jtf_user){
			jta_display.append(cnt++ +"회차. "+jtf_user.getText()+" : "+account(jtf_user.getText())+"\n");
			jtf_user.setText("");		
		}
		else if(obj==jbtn_new) {
			ranCom();
			jta_display.setText("");
			jtf_user.setText("");
			jtf_user.requestFocus();
			
		}
		else if(obj==jbtn_dap) {
			jta_display.append("정답은 "+com[0]+com[1]+com[2]+"\n");
		}
		else if(obj==jbtn_clear) {
			jta_display.setText("");
			jtf_user.setText("");
			jtf_user.requestFocus();
		}
		
	}

}
