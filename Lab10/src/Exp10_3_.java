import java.util.Scanner;
import java.util.StringTokenizer;
public class Exp10_3_ {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {		 
			System.out.print(">>> ");
			String input = scanner.nextLine(); //next�� �ƴ϶� nextLine!!
			if (input.equals("�׸�")) {
				
				System.out.println("�����մϴ�.");
				break;
			}
			String[] out = input.split(" ");
			System.out.println("���� ������ "+out.length);
		}
	
	}
}