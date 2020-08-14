package Game.BaseBall;

public class Text {
	int g_i;
	void methodA() {
		int a_i;
		a_i = 1;
		g_i++;
	}
	void methodB() {
		g_i = g_i+5;
		
	}
	public static void main(String[] args) {
		Text t1 = new Text();
		t1.methodA();//메소드호출
		System.out.println(t1.g_i);
		t1.methodB();
		System.out.println(t1.g_i);
		Text t2 = new Text();
		t2.methodA();
		System.out.println(t2.g_i);
	}

}
