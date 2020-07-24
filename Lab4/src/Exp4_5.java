import java.util.Scanner;
import java.util.InputMismatchException;
public class Exp4_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first;
		int second;
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력 >> ");
				first = scanner.nextInt();
				second = scanner.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine(); ////////////////////////중요
				continue;
			}
			System.out.println(first + "X" + second + " = "+(first*second));
			break;
		}
	}

}
