import java.util.Scanner;
public class Exp2_1 {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원) >> ");
		Scanner scanner = new Scanner(System.in);
		int input_money=scanner.nextInt();
		System.out.println(input_money+"은 $"+(float)input_money/1100 +"입니다.");
		scanner.close();
	}
}
