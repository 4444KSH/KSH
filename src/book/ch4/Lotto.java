package book.ch4;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int x[] = new int[6];
		for(int i=0;i<6;i++) {
			x[i]=r.nextInt(45)+1;	
			for(int j=0;j<i;j++) {
				if(x[i]==x[j]) {
					i--;//중복숫자가 나올시 재검색
				}
			}
			System.out.print(x[i]);
			System.out.print(" ");//중복숫자가 나옴
		}
		
		
	}

}
