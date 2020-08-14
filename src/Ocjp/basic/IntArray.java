package Ocjp.basic;
//배열의 시작 Index는 0.
//a2의 주소번지와 a2[0]의 주소번지가 같기 때문이다.
//
public class IntArray {
	void a2Print(int[] a) {
		for(int i=0;i<a.length;i++) {//배열의 크기가 2
		//for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//개선된 for문- 네가 가진거 다 보여줘
		for(int b:a) {//b라는 타입의 배열 a를 다 보여준다
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		int i,j =0;
		i =2;
		System.out.println(i+", "+j);//
		int x[],y=0;
		//int[]a2, b=0;
		int[]a2, b2;
		//선언시에는 대괄호를 반드시 붙이지만. 생성시에는 생략해야함
		//파라미터 자리에 배열을 넘길 수 있다.
		a2=new int[2];//0,0 초기화
		b2=new int[3];//0,0,0 초기화
		//insert here
		IntArray ia = new IntArray();
		ia.a2Print(a2);
	}

}
