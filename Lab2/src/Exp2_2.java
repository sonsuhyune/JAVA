import java.util.Scanner;
public class Exp2_2 {
	public static void main(String[] args) {
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		int first=scanner.nextInt();
		int second=scanner.nextInt();
		int third=scanner.nextInt();
		
		if ((first <= second+third) || (second<=first+third) || (third<=first+third))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �ƴմϴ�.");
		
		scanner.close();
	}
}
