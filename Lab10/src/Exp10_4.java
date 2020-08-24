import java.util.Scanner;
public class Exp10_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다");
		
		String input = scanner.nextLine();
		//string의 길이는 length(), 배열은 length
		
		for(int i = 0;i<input.length();i++) {
			String input_end = input.substring(1);
			String input_first = input.substring(0,1);
			input = input_end.concat(input_first);
			System.out.println(input);
		}
	}
}
