import java.util.Scanner;
public class Exp2_4_switch {
	public static void main(String[] args) {
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int input_num=scanner.nextInt();
		
		switch (input_num){
		case 1:
		case 2:
		case 12:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("1~12 ������ ���ڸ� �Է��ϼ���!");
			break;
		
		}
		scanner.close();
	}
}
