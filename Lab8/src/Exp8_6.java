
interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw(); 
	}
}

class Oval implements Shape{
	private int x,y;
	public Oval(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw() {
		System.out.println(x+"x"+y+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea() {
		return PI*x*y;
	}
}

class Rect implements Shape{
	private int x,y;
	public Rect(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw() {
		System.out.println(x+"x"+y+"ũ���� �簢���Դϴ�.");
	}
	public double getArea() {
		return x*y;
	}
}
public class Exp8_6 {
	public static void main(String args[]) {
		Shape[] list = new Shape[3];
		list[0]=new Circle(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect(10,40);
		
		for(int i = 0;i<list.length;i++)
			list[i].redraw();
		for(int i = 0;i<list.length;i++)
			System.out.println("������ "+list[i].getArea());
		
	}

}
