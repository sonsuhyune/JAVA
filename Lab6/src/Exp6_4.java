import java.util.Scanner;
class Add{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return this.a+this.b;
	}
}
class Sub{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return this.a-this.b;
		
	}
}
class Mul{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return this.a*this.b;
	}
}

class Div{
	private int a,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return this.a/this.b;
	}
}



public class Exp6_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int input_a = scanner.nextInt();
		int input_b = scanner.nextInt();
		String math = scanner.next();
		//char mathh=math.charAt(0); //*******
		int result=0;
		switch(math) {
		case "+": //case는 :, break까먹지 말기
			Add add = new Add();
			add.setValue(input_a, input_b);
			result = add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(input_a, input_b);
			result = sub.calculate();
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(input_a, input_b);
			result = mul.calculate();
			break;
			
		case "/":
			Div div= new Div();
			div.setValue(input_a, input_b);
			result = div.calculate();
			break;
		default:
			System.out.println("두 정수와 연산자를 입력하시오");
			break;
		}
		System.out.println(result);
	}
}
