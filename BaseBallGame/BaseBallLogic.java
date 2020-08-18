package BaseBallGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class BaseBallLogic implements ActionListener {
   
    BaseBallGameView bbgv = null;
    BaseBallGameEvent bbge = null;
    public BaseBallLogic(BaseBallGameView bbgv,BaseBallGameEvent bbge) {
    	this.bbgv = bbgv;
    	this.bbge = bbge;
    }
   
   int my[] = new int[3];
   int com[] = new int[3];
   int cnt = 0;
   
public void ranCom() {
      com[0] = (int)(Math.random()*10);
      do {
         com[1] = (int)(Math.random()*10);
      }while(com[0] ==com[1]);
      do {
         com[2] = (int)(Math.random()*10);
      }while(com[1]==com[2]||com[0]==com[2]);
}
public String account(String user) {
   int temp = 0;
   int strike = 0; 
   int ball = 0; 
   temp= Integer.parseInt(user);
   my[0] = temp/100;
   my[1] = (temp%100)/10;
   my[2] = temp%10;
   JOptionPane.showMessageDialog(null, my[0]+""+my[1]+""+my[2]);
   for(int i=0;i<3;i++) {
      for(int j=0; j<3;j++) {
         if(my[i]==com[j]) {//너 안에 내가 가진 숫자가 있는거야?
            if(i==j) { //그러면 자리까지 일치하는거냐?
               strike++;
            }
            else ball++;
         }
      }
   }
   if(strike==3) {
      return "정답입니다";
   }
   return strike+"스트라이크 "+ball+" 볼";
}


   @Override
   public void actionPerformed(ActionEvent e) {
      
   String label = e.getActionCommand(); 
   Object obj = e.getSource();
   

   
   
   
   if("나가기".equals(label)) {
      System. exit(0); 
      
   }
   else if(e.getSource()==bbgv.jtf_user) { //e.getSource() = 이벤트가 나온 주소번지를 찾아준다
      bbgv.jta_display.append(++cnt+"회차. "+bbgv.jtf_user.getText()+":"+account(bbgv.jtf_user.getText())+"\n");
      bbgv.jtf_user.setText   ("");
      
   }//입력하고 엔터쳤을때
   else if(obj==bbgv.jbtn_dap) {
      bbgv.jta_display.append("정답은" +com[0]+com[1]+com[2]+"\n");
   }
   else if("새게임".equals(label)) { // 너가누른게 새게임이라면
      cnt = 0;
      ranCom();
      bbgv.jta_display.setText("");
      
   }
   else if("지우기".equals(label)) {
      bbgv.jta_display.setText("");
   }
   
   
   if(e.getSource()==bbgv.jtf_user ) {
      bbgv.jta_display.append(bbgv.jtf_user.getText()+"\n");
      bbgv.jtf_user.setText(""); // 아무것도 남지 않게해줘
}
}
}