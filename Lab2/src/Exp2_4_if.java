import java.util.Scanner;
public class Exp2_4_if {
	public static void main(String[] args) {
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int input_num=scanner.nextInt();
		if ((input_num >= 3) && (input_num <=5))
			System.out.println("��");
		else if ((input_num >= 6) && (input_num <=8))
			System.out.println("����");
		else if ((input_num >= 9) && (input_num <=11))
			System.out.println("����");
		else if ((input_num == 12) || ((input_num ==2) || (input_num ==1 ))) 
			System.out.println("�ܿ�");
		else
			System.out.println("1~12 ������ ���� �Է��ϼ���");
		scanner.close();
	}
}
