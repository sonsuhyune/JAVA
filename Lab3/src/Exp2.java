import java.util.Scanner;
public class Exp2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >>> ");
		int input_num = scanner.nextInt();
		if (input_num<=0) {
			System.out.println("0보다 큰 정수를 입력하세요.");
		}
		else {
			for (int i = input_num;i>0;i--) {
				for (int j =0;j<i;j++)
					System.out.print("*");
				System.out.println();
			}
		}
		
		scanner.close();
	}
}
