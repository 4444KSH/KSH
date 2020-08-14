package Report.ch4;

import java.util.Random;

public class RandomGame2 {

	public static void main(String[] args) {
		Random r = new Random();
		int sum=0;
		int hap=0;
		for(int i=1;i<=10;i++) {
			int x=r.nextInt(21)-10;
			if(x>=0) {
				sum+=x;
			}
			else{
				hap+=x;
			}
			
		}
		System.out.println("양수의 합 = "+sum);
		System.out.println("음수의 합 ="+hap);
	}

}
