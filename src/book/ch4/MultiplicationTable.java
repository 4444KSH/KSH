package book.ch4;

public class MultiplicationTable {

	public static void main(String[] args) {
		int x;
		int y;
		for(x=2;x<=9;x++) {
			for(y=1;y<=9;y++) {
				System.out.println(x+"*"+y+"="+x*y);
			}
		}
	}

}
