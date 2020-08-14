package book.ch4;
//1~100까지 새면서
//5의 배수면 Fizz, 7의 배수면 Buzz
public class Fizz_Buzz5 {
	public void methodA() {
		int i=1;
		while(i<=100) {
			switch(i%35) {
				case 0 : System.out.println("Fizz&Buzz("+i+")");
					break;
				case 5:case 10:case 15:case 20:case 25:case 30 :
					System.out.println("Fizz("+i+")");
					break;
				case 7:case 14:case 21:case 28 :
					System.out.println("Buzz("+i+")");
				default :
					System.out.println(i);
			}
			i++;
			
			}
	}

	public static void main(String[] args) {
		Fizz_Buzz5 fb5 = new Fizz_Buzz5();
		fb5.methodA();
	}
		
	

}
