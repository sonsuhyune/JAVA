
public class TV {
	
	String name;
	int year;
	int len;
	public TV(String name, int year, int len) {
		this.name = name;
		this.year=year;
		this.len = len;
		   
	}
	public void show() {
		System.out.println(this.name+"���� ���� "+this.year+"���� "+this.len+"��ġ TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("LG",2017,32);
		myTv.show();
	}
}
