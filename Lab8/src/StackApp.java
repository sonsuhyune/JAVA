import java.util.Scanner;
public class StackApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>> ");
		int val = scanner.nextInt();
		StringStack sk = new StringStack(val);
		
		while (true) {
			System.out.print("���ڿ� �Է� >>> ");
			String input = scanner.next();
			if (input.equals("�׸�")) {
				System.out.print("���ÿ� ����� ��� ���ڿ� �� >>> ");
				for(int i = sk.length() ; i> 0 ; i--) {
					System.out.print(sk.pop()+" "); 
				}
				return;
			}
			boolean push_re = sk.push(input);
			if (push_re == false)
				System.out.println("������ �� ���� Ǫ�� �Ұ� !");
			
		}
		
		
	}
}
