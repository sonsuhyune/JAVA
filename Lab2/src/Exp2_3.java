import java.util.Scanner;
public class Exp2_3 {
	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >>");
		Scanner scanner = new Scanner(System.in);
		int input_num = scanner.nextInt();
		int check=0;
		
		
		if ((input_num <= 99) && (input_num >=1)) {
			
			if (((input_num / 10) == 3) || ((input_num / 10) == 6) ||((input_num / 10) == 6))
				check+=1;
			if ((input_num % 10) == 3 || ((input_num % 10) == 6) || ((input_num % 10) == 9))
				check+=1;
			
			if (check == 1)
				System.out.println("�ڼ�¦");
			else if (check ==2)
				System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�����");
		}
		else
			System.out.println("1~99������ ������ �Է��ϼ���!");
		scanner.close();
		
			
	}
}
