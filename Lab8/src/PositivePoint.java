class Point{
	private int a, b;
	public Point(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void move(int x, int y) {
		if (x>=0 && y>=0) {
			this.a=x;
			this.b=y;
		}
	}
	public String toString() {
		return ("("+this.a+","+this.b+")의 점 ");
	}
}
public class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int a, int b) {
		super(a,b);
		if (a < 0 || b < 0)
			super.move(0, 0);; //super()생성자는 첫줄에 나와야하므로 move 사용
		
		
		
		
	} 
	public static void main(String args[]) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5,-5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2= new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
		
		
	}
}
