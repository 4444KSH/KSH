package Orcale.db;

public class StringTest {

	public static void main(String[] args) {
		String msg = "hello";
		msg=msg.replace('e', 'o');//replace('원본문자','바꿀문자')
		System.out.println(msg);
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world!!!");//append =>앞에있는것에 붙여주기
		System.out.println(sb.toString());
		String str = "hello";//Class 1
		str=str+" world";//Class 2
		str+=" java";//Class 3
		System.out.println(str);
		
	}

}
