import java.util.Scanner;
import java.util.HashMap;
public class Exp11_3 {
	public static void main(String args[]) {
		HashMap<String, Integer> nations = new HashMap<String,Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >>> ");
			String in = scanner.next();
			
			if(in.equals("�׸�"))
				break;
			int input = scanner.nextInt();
			nations.put(in,input);
		}
		while(true) {
			System.out.print("�α� �˻� >>> ");
			String find = scanner.next();
			if (find.equals("�׸�"))
				break;
			if(nations.get(find) == null)
				System.out.println(find+" ����� �����ϴ�.");
			else
				System.out.println(find+"�� �α��� "+nations.get(find));
			
		}
		
	}
}
