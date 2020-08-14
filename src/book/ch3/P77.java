package book.ch3;

public class P77 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		//if((++x<y)&(x>y--)) {//참일 때
		if((++x<y)|(x>y--)) {//참일 때
			System.out.println("참일때");
		}
		else {//거짓일때
			System.out.println("거짓일때");	
		}
		//insert here
		//x=?, y=?
		System.out.println("x="+x+",y="+y);
		System.out.println("=========[[after]]=========");
		x=1;
		y=2;
		//if((++x<y)&&(x>y--)) {//참일 때
		if((++x<y)||(x>y--)) {//참일 때
			System.out.println("참일때");
		}
		else {//거짓일때
			System.out.println("거짓일때");
		}
		System.out.println("x="+x+",y="+y);
		System.out.println("=========[[after]]=========");
		x=1;
		y=2;
		if((++x<=y)|(x>y--)) {
			System.out.println("참일때");
		}
		else {
			System.out.println("거짓일때");		
		}
		System.out.println("x="+x+",y="+y);
		System.out.println("=========[[after]]=========");
		x=1;
		y=2;
		if((++x<=y)||(x>y--)) {
			System.out.println("참일때");
		}
		else {
			System.out.println("거짓일때");	
		}
		System.out.println("x="+x+",y="+y);
	}

}
