package book.ch4;

public class RandomTest {

	public static void main(String[] args) {
		int com[]=new int[3];
		com[0] = (int)(Math.random()*10);
		for(int n=0;n<=9;n++) {
		do {
			com[1] =(int)(Math.random()*10);
		}while(com[0]==com[1]);
		do {
			com[1] =(int)(Math.random()*10);
		}while(com[0]==com[1]||com[1]==com[2]);
		System.out.println(com[0]+""+com[1]+""+com[2]);
		}
	}

}
