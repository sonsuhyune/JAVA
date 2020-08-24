interface Shape_{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
public class Circle implements Shape{
	private int r;
	public Circle(int r) {
		this.r=r;
	}
	public void draw() {
		System.out.println("반지름이 "+r+"인 원입니다.");
	}
	public double getArea() {
		return PI*r*r;
	}
	public static void main(String arg[]) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
 