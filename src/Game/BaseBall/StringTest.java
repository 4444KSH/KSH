package Game.BaseBall;

public class StringTest {

	public static void main(String[] args) {
		String s1=new String("apple");
		String s2=new String("apple");
		String s3="haha";
		//s1의 주소번지와 s2의 주소번지가 같은가?
		System.out.println(s1==s2);//false
		//s1이 가리키는 문자열과 s2가 가리키는 문자열이 같은가?
		System.out.println(s1.equals(s2));

	}

}
