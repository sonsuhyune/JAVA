import java.util.Scanner;
public class Exp10_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�");
		
		String input = scanner.nextLine();
		//string�� ���̴� length(), �迭�� length
		
		for(int i = 0;i<input.length();i++) {
			String input_end = input.substring(1);
			String input_first = input.substring(0,1);
			input = input_end.concat(input_first);
			System.out.println(input);
		}
	}
}
