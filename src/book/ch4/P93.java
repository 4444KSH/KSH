package book.ch4;

public class P93 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i=1,sum=0; i<=5; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}