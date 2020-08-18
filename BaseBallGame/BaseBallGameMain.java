package BaseBallGame;

import Game.BaseBall.BaseBallGame;

public class BaseBallGameMain  {
	   public BaseBallGameMain() {	   
	   }
	   public BaseBallGameMain(BaseBallGameView bbgv, BaseBallLogic bbl) {
		   this.bbgv = bbgv;
		   this.bbl = bbl;
	   }
	   public static void main(String[] args) {
	      BaseBallGameMain bbgm = new BaseBallGameMain();
//	      Class cls = bbgm.bbgv.getClass();
	      bbgm.bbgv.initDisplay();
	      bbgm.bbl.ranCom();
	   }
	}