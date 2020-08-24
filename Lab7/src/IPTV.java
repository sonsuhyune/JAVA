
public class IPTV extends ColorTV{
	private String IP;
	 
	public IPTV(String IP, int size, int ncolors) {
		super(size,ncolors); //super 위치! 
		this.IP=IP;
		
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+this.IP+"주소의 ");
		super.printProperty(); //부모의 method쓸때!!super.으로 사용하기
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
