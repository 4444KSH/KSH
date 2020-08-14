package BookeManager.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class BookManagerEventHandler extends Handler implements ActionListener {
	BookManager bm = null;//주의사항 : 절대로 new를 하면 안됨. new를 하면 복사본이 만들어진다.
	public BookManagerEventHandler(BookManager bm) {
		this.bm =  bm;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();//입력|수정|상세정보
		System.out.println("label==>"+label);
		if("입력".equals(label)) {
			System.out.println(label);
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setVisible(true);
			bm.bookCRUD.setSize(500,400);
		}
		else if("수정".equals(label)) {
			System.out.println(label);
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setVisible(true);
			bm.bookCRUD.setSize(500,400);
		}
		else if("상세정보".equals(label)) {
			System.out.println(label);
			bm.bookCRUD.setTitle(label);
			bm.bookCRUD.setVisible(true);
			bm.bookCRUD.setSize(500,400);
		}
		else if("나가기".equals(label)) {
			System.exit(0);
		}
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publish(LogRecord arg0) {
		// TODO Auto-generated method stub
		
	}

}
