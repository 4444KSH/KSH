package book.ch4;

public class ForIF {

	public static void main(String[] args) {
		int i;//기본숫자
		int sum;//짝수의합
		int hap;//홀수의합
		for(i=1,sum=0,hap=0;i<=10;i++) {
			if(i%2==0) {
				sum+=i;
				//System.out.print(i);
				//if(i!=10)
					//System.out.print(" + ");
			}
			else {
				hap+=i;
				//System.out.print(i);
				//if(1!=10)
					//System.out.print(" + ");
			}

	}

		System.out.println("짝수의합 "+sum);
		System.out.println("홀수의합 "+hap);
	}
}
