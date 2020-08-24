import java.util.Scanner;
class Add extends Calc{
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{ 
	public int calculate() {
		return a/b;
	}
}
public class CalcApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String math = scanner.next();
		char m=math.charAt(0);
		
		
		Calc calc;
		
		switch(m) {
		case '+':
			calc = new Add();
			break;
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/':
			calc = new Div();
			break;
		default:
			System.out.println("두 정수와 연산자를 입력하세요");
			return;
		}
		calc.setValue(a, b);
		if(calc instanceof Div && b==0 ) {
			System.out.println("0으로 나눌수없습니다");
			return;
		}
		System.out.println(calc.calculate());
		
		scanner.close();
	}
}
