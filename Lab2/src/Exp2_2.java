import java.util.Scanner;
public class Exp2_2 {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int first=scanner.nextInt();
		int second=scanner.nextInt();
		int third=scanner.nextInt();
		
		if ((first <= second+third) || (second<=first+third) || (third<=first+third))
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 아닙니다.");
		
		scanner.close();
	}
}
