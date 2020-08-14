package BookeManager.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

//public class BookManager extends JFrame implements ActionListener {
public class BookManager extends JFrame {
	JMenuBar	jmb 	 = new JMenuBar();
	JMenu	 	jm_edit  = new JMenu("edit");
	JMenuItem 	jmi_ins  = new JMenuItem("입력");
	JMenuItem 	jmi_upd  = new JMenuItem("수정");
	JMenuItem 	jmi_det  = new JMenuItem("상세정보");
	JMenuItem 	jmi_exit = new JMenuItem("나가기");
	JSeparator	js1 	 = new JSeparator();//줄 그어주는것
	BookManagerEventHandler handler = new BookManagerEventHandler(this);//다른곳에서 사용하기 위해서는 주소번지가 필요하니
																		//this를 넣었다.
	BookCRUD bookCRUD = new BookCRUD();
	//생성자는 Default 생성자를 제외하고는 무조건 개발자가 추가로 입력한다.
	public BookManager() {
		
	}
	
	public void initDisplay() {
		//이벤트 소스와 이벤트 처리 핸들러 클래스를 매칭하기.
		jmi_ins.addActionListener(handler);//this는 BookManager 이 Class 안에 ActionPerformed가 있어야 함.
		jmi_upd.addActionListener(handler);
		jmi_det.addActionListener(handler);
		jmi_exit.addActionListener(handler);
		jm_edit.add(jmi_ins);
		jm_edit.add(jmi_upd);
		jm_edit.add(jmi_det);
		jm_edit.add(js1);// jmi_det 밑에 줄이 하나 그어진다.
		jm_edit.add(jmi_exit);
		jmb.add(jm_edit);
		this.setJMenuBar(jmb);
		this.setSize(700, 450);
		this.setTitle("도서관리 시스템 Ver1.0");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		BookManager bm = new BookManager();
		bm.initDisplay();
	}
	//어노테이션-오버라이드; 부모가 선언한 메소드를 재정의 하는것.
	//@Override
	//public void actionPerformed(ActionEvent e) {
	//	
	//}

}
