import java.util.Scanner;
import java.util.InputMismatchException;
public class Exp4_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first;
		int second;
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
				first = scanner.nextInt();
				second = scanner.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine(); ////////////////////////�߿�
				continue;
			}
			System.out.println(first + "X" + second + " = "+(first*second));
			break;
		}
	}

}
