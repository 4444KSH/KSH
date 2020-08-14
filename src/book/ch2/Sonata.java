package book.ch2;

public class Sonata {
	int speed=0;
	void speedUp() {
		speed=speed+1;
	}
	void speedDown() {
		speed=speed-1;
	}
	//메인 스레드(Thread)-우선순위 1번
	public static void main(String[] args) {
		Sonata myCar = new Sonata();
		System.out.println(myCar);
		System.out.println(myCar.speed);
		Sonata himCar = new Sonata();
		himCar.speedUp();
		System.out.println(himCar);
		System.out.println(himCar.speed);
		
	}

}
