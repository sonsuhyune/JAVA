import java.util.Scanner;
public class Exp3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >>> ");
		String input = scanner.next();
		if (input.length()>1) {
			System.out.println("�ϳ��� �Է��ϼ���.");
			scanner.close();
			return;
		}
		char input_re=input.charAt(0);
		if ((input_re < 'a')||(input_re > 'z')) {
			System.out.println("a~z ������ ���ĺ��� �Է��ϼ���");
			scanner.close();
			return;
		}
		for (char i = input_re;i>='a';i--) {
			for (char j = 'a'; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
