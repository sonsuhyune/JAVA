
public class IPTV extends ColorTV{
	private String IP;
	 
	public IPTV(String IP, int size, int ncolors) {
		super(size,ncolors); //super ��ġ! 
		this.IP=IP;
		
	}
	public void printProperty() {
		System.out.print("���� IPTV�� "+this.IP+"�ּ��� ");
		super.printProperty(); //�θ��� method����!!super.���� ����ϱ�
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
