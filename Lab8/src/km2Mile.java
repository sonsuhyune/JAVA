import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.print(srcString()+"을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		
		System.out.println("변환 결과: "+res+destString()+"입니다.");
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
