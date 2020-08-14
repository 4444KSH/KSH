package book.ch4;
//1~100까지 새면서
//5의 배수면 Fizz, 7의 배수면 Buzz
public class Fizz_Buzz2 {
	public void methodA() {
		
	for(int i=1;i<=100;i++) {
		if(i%5==0&&i%7==0) {
			System.out.println("Fizz&Buzz("+i+")");
		}
		else if(i%5==0) {
			System.out.println("Fizz("+i+")");
		}
		else if(i%7==0) {
			System.out.println("Buzz("+i+")");
		}
		else {
			System.out.println(i);
		}
	}
	}

	public static void main(String[] args) {
		Fizz_Buzz2 fb2 = new Fizz_Buzz2();
		fb2.methodA();
			}
		
	

}
