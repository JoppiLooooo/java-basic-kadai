package kadai.kadai_015;

public class Car_Chapter15 {
	private int gear  = 1;
	private int speed = 10;
	
	public Car_Chapter15( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void chageGear(int afterGear) {
		switch(this.gear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default  -> this.speed = 10;
		};
	}
	
	public void run() {
		System.out.println("speed is " + this.speed);
	}
}
