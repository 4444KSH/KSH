package Orcale.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMgr {
	public static final String _DRIVER ="oracle.jdbc.driver.OracleDriver";//ClassNotFoundException
	public static final String _URL	   ="jdbc:oracle:thin:@192.168.0.38:1521:orcl11";
	public static String _USER 		   ="scott";
	public static String _PW 		   ="tiger";
	public Connection con =null;//인터페이스 
	//물리적으로 떨어져 있는 오라클 서버와 연결통로 만들기
	public Connection getConnection() {
		try {//예외처리 실행시 에러가 발생할 가능성이 있는 코드는 try..catch안에 써준다.
			Class.forName(_DRIVER);
			con = DriverManager.getConnection(_URL,_USER,_PW);//인스턴스화, 메소드 Overloading
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
		}catch (Exception e) {
			System.out.println("연결 실패!"+e.toString());
		}
		return con;//con대신 Null을 호출해도 문법적으로는 오류가 안뜨지만 실행시 NullPointerException 에러가 뜬다. 인스턴스화 오류
	}
	public static void main(String args[]) {
		DBConnectionMgr dbMgr=new DBConnectionMgr();
		dbMgr.con=dbMgr.getConnection();
		System.out.println("con===> "+dbMgr.con);
	}
}
