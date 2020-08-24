class TV{
	private int size;
	public TV(int size) {
		this.size = size;
		
	} 
	protected int getSize(){
		return this.size;
	}
}
public class ColorTV extends TV{
	private int ncolors;
	public ColorTV(int size, int ncolors) {
		super(size);
		this.ncolors=ncolors;
		
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+ncolors+"컬러");
	}
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}

