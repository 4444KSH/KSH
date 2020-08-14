package book.ch4;

public class FlowChart_step1 {
	int i=0,sum=0,hap=0;
	//i:1부터 10까지의 변하는 변수
	//sum:짝수의합
	//hap:홀수의합
	
	public static void main(String[] args) {
		FlowChart_step1 fcs1 = new FlowChart_step1();
		for(fcs1.i=1;fcs1.i<=10;fcs1.i++) {
			//전역변수는 초기화를 실행하지 않아도 자동으로 초기화된다.
			if(fcs1.i%2==0) {
				fcs1.sum+=fcs1.i;
			}
			else {
				fcs1.hap+=fcs1.i;
			}
		}
		System.out.println("짝수의 합 = "+fcs1.sum);
		System.out.println("홀수의 합 = "+fcs1.hap);
	}

}
