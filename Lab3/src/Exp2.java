import java.util.Scanner;
public class Exp2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� >>> ");
		int input_num = scanner.nextInt();
		if (input_num<=0) {
			System.out.println("0���� ū ������ �Է��ϼ���.");
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
