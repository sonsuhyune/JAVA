class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ColorPoint extends Point{
	private String color ;
	public ColorPoint() {
		this(0,0); //ColorPoint(int x, int y) ������ ȣ���ϸ鼭 black�� ���Ե�
		//this.color="BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
		this.color="BLACK"; //
		
	}
	public void setXY(int x, int y) {
		super.move(x,y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return color+"���� ("+getX()+","+getY()+") �� ��";
	}
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		 
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}
	
}
