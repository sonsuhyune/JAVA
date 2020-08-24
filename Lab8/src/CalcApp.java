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
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >>> ");
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
			System.out.println("�� ������ �����ڸ� �Է��ϼ���");
			return;
		}
		calc.setValue(a, b);
		if(calc instanceof Div && b==0 ) {
			System.out.println("0���� �����������ϴ�");
			return;
		}
		System.out.println(calc.calculate());
		
		scanner.close();
	}
}
