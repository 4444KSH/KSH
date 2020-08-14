package Orcale.db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.ch5.DeptVO;
/* 생성자 안에서도 메소드 호출이 가능함
 * 변수선언도 가능함.
 * 내안에 있는 메소드를 호출하는 것이므로 메소드 호출은 필요없다.
 * 생성자 앞에는 static이 없다.
 * non-static에서 non-static은 접근가능
 * static 에서 non-static은 인스턴스화를 해야함.
 */
public class DeptApp2 extends JFrame implements ActionListener, MouseListener {
	JMenuBar  jmb		=new JMenuBar();
	JMenu 	  jm_db     =new JMenu("오라클연계");
	JMenuItem jmi_con   =new JMenuItem("연결");
	JMenuItem jmi_sel   =new JMenuItem("조회");
	JMenuItem jmi_ins   =new JMenuItem("등록");
	JMenuItem jmi_upd   =new JMenuItem("수정");
	JMenuItem jmi_del   =new JMenuItem("삭제");
	JMenuItem jmi_exit  =new JMenuItem("나가기");
	JTable	  jt_dept	=null;
	//JTable는 양식, 폼을 그려주는 클래스
	JScrollPane jsp_dept=null;
	String cols[]={"부서번호","부서명","지역"};//1차배열
	String data[][]=new String[0][3];//2차배열
	DefaultTableModel dtm=null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con  	=null;
	PreparedStatement pstmt = null;//Oracle 서버에 SELECT문을 가져가고 요청한 후 결과를 받아오는 역할
	ResultSet rs			=null;//SELECT문을 컨트롤할 때 필요,커서를 조작,Oracle에 살고 있는 일꾼이 있다. 옵티마이저
	public DeptApp2() {//Default 생성자
		initDisplay();
	}
	public void initDisplay() {
		dtm = new DefaultTableModel(data,cols);
		jt_dept = new JTable(dtm);
		jt_dept.addMouseListener(this);
		jsp_dept = new JScrollPane(jt_dept,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
										   JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jmi_sel.addActionListener(this);//actionPerformed
		jm_db.add(jmi_con);
		jm_db.add(jmi_sel);
		jm_db.add(jmi_ins);
		jm_db.add(jmi_upd);
		jm_db.add(jmi_del);
		jm_db.add(jmi_exit);
		jmb.add(jm_db);
		this.add("Center",jsp_dept);
		this.setJMenuBar(jmb);
		this.setVisible(true);
		this.setSize(450, 320);
	}
	public void RefreshData() {
		String sql = "SELECT deptno, dname, loc FROM dept";
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql);//로딩 성공. 위에 con을 호출하지 않으면 값이 없다.
			rs = pstmt.executeQuery();
			DeptVO dvo=null;
			DeptVO[] dvos = new DeptVO[4];				
			int i=0;
			while(rs.next()) {
				dvo=new DeptVO();
				System.out.println(rs.getInt("deptno")
							+", "+rs.getString("dname")
							+", "+rs.getString("loc"));
				dvo.setDeptno(rs.getInt("deptno"));
				dvo.setDname(rs.getString("dname"));
				dvo.setLoc(rs.getString("loc"));
				dvos[i]=dvo;
				++i;
			}
			//화면에 출력하기
			for(int j=0;j<4;j++) {
				DeptVO rdvo = dvos[j];
				System.out.println(rdvo.getDeptno()
						+", "+rdvo.getDname()
						+", "+rdvo.getLoc());
				Vector oneRow =new Vector<>();
				/*oneRow.add(10);
				oneRow.add("ACCOUNTING");
				oneRow.add("NEW YORK");*/
				oneRow.add(rdvo.getDeptno());
				oneRow.add(rdvo.getDname());
				oneRow.add(rdvo.getLoc());
				dtm.addRow(oneRow);
			}
		} catch (SQLException e2) {//SQLException은 Oracle의 오류를 잡아주는 코드
			
		}
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DeptApp2();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();//문자열 라벨 가져오기.

		//너 조회 버튼 누른거야?
		if("조회".equals(label)) {
			System.out.println("조회 버튼 클릭 성공.");
			RefreshData();
		}
		if("연결".equals(label)) {
			System.out.println("연결 버튼 클릭 성공.");
			RefreshData();
		}
	}
	@Override
	public void mouseClicked(MouseEvent me) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getClickCount()==2) {
			System.out.println("더블 클릭");
		}		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}