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
		return ("("+this.a+","+this.b+")�� �� ");
	}
}
public class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int a, int b) {
		super(a,b);
		if (a < 0 || b < 0)
			super.move(0, 0);; //super()�����ڴ� ù�ٿ� ���;��ϹǷ� move ���
		
		
		
		
	} 
	public static void main(String args[]) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5,-5);
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2= new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "�Դϴ�.");
		
		
	}
}
