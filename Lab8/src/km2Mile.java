import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"�� "+destString()+"�� �ٲߴϴ�.");
		System.out.print(srcString()+"�� �Է��ϼ��� >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		
		System.out.println("��ȯ ���: "+res+destString()+"�Դϴ�.");
		scanner.close();
	}
}

public class km2Mile extends Converter{
	
	public km2Mile(double ratio) {
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src / ratio;
	}
	@Override
	protected String srcString() {
		return "km";
	}
	@Override
	protected String destString() {
		return "mile";
	}
	
	public static void main(String args[]) {
		km2Mile toMile = new km2Mile(1.6);
		toMile.run();
	}
	
	
	
}
