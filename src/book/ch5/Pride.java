package book.ch5;

public class Pride {//extends Object->모든 class에 붙어있지만 생략할 수 있다.//toString()->주소번지호출(생략가능)
	int speed =0;
	public String toString() {
		return "자동차1";//toString로 호출;; return은 반환값이다.
	}
	public static void main(String[] args) {
		Pride car1 = new Pride();
		System.out.println(car1);
	}

}
