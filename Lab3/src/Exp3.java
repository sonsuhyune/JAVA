import java.util.Scanner;
public class Exp3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >>> ");
		String input = scanner.next();
		if (input.length()>1) {
			System.out.println("하나만 입력하세요.");
			scanner.close();
			return;
		}
		char input_re=input.charAt(0);
		if ((input_re < 'a')||(input_re > 'z')) {
			System.out.println("a~z 사이의 알파벳을 입력하세요");
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
