import java.util.Scanner;
public class Exp2_1 {
	public static void main(String[] args) {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		Scanner scanner = new Scanner(System.in);
		int input_money=scanner.nextInt();
		System.out.println(input_money+"�� $"+(float)input_money/1100 +"�Դϴ�.");
		scanner.close();
	}
}
