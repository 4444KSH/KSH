package book.ch4;

public class SwitchTest {
	public int others(int x) {//x가 5일때의 기준
		switch(x) {
		case 6 :x--;
		case 5 :x--;
		case 4 :x--;
		case 3 :x--;
		break;
		default:x--;
		break;
		}
		return x;
	}
	//메소드 앞에 static이 있으면 인스턴스화가 필요없다.
	//static이 없는 메소드를 호출 할 땐 무조건 인스턴스화 해야한다.
	//파라미터 자리는 지역변수 자리이다. - 초기화를 해야한다. - 선언만 하는것은 문제되지 않지만 사용할땐 문제된다.
	public static int switchit(int x) {//파라미터 자리에 x값은 호출할 때 결정 된다.
		//SwitchTest st = new SwitchTest();
		int j = 1;
		switch(x) {
		case 1 :j++;
		case 2 :j++;
		case 3 :j++;
		case 4 :j++;
		case 5 :j++;
		default:j++;
		}
		return j+x;
	}

	public static void main(String[] args) {
		SwitchTest st = new SwitchTest();//복사본
		//Static 메소드인 main안에서 Static으로 선언된 switchit메소드를 호출 할 때에는 클래스이람.메소드이름으로 호출함.
		int x=st.others(5);
		System.out.println(x);
		int y=switchit(4);
		System.out.println(y);//원본

	}

}
