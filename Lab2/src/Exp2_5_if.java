import java.util.Scanner;
public class Exp2_5_if {
	public static void main(String[] args) {
		System.out.print("���� >> ");
		Scanner scanner = new Scanner(System.in);
		
		int first = scanner.nextInt();
		String math = scanner.next();
		int second = scanner.nextInt();
		int result;
		if (math.equals("+")) {
			result=first+second;
			System.out.println(first+math+second+"�� ��� ����� "+result);
		}
		else if (math.equals("-")) {
			result=first-second;
			System.out.println(first+math+second+"�� ��� ����� "+result);
		}
		else if (math.equals("*")) {
			result=first*second;
			System.out.println(first+math+second+"�� ��� ����� "+result);
		}
		else if (math.equals("/")) {
			if (second==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
			{
				result=first/second;
				System.out.println(first+math+second+"�� ��� ����� "+result);
		
			}
		}
		else
			System.out.println("=,-,*,/ �� �ϳ��� �����ڸ� ����ϼ���.");
		scanner.close();	
	}
}
