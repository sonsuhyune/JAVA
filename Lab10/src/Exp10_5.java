import java.util.Scanner;
import java.lang.StringBuffer; //lang�� ����!
public class Exp10_5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		String input_sen = scanner.nextLine();
		StringBuffer sb = new StringBuffer(input_sen);
		while(true) {
			System.out.print("���: ");
			String input = scanner.nextLine(); //nextLine���� �ؾ���!!
			if(input.equals("�׸�"))
			{	System.out.println("�����մϴ�.");
				break;
			}
			String[] input_array=input.split("!");
			//System.out.println(input_array[0].length());
			//System.out.println(input_array[1]);
			if(input_array.length != 2 || input_array[0].length() ==0 ||input_array[1].length() ==0) {
				System.out.println("�߸��� ����Դϴ�.");
				
			} 
			else {
				int where = sb.indexOf(input_array[0]);
				if(where == -1)
					System.out.println("ã�� �� �����ϴ�.");
				else {
					sb.replace(where, where+input_array[0].length(), input_array[1]); 
					//sb�� �ڵ����� �ݿ���
					System.out.println(sb);
				}
			}
			
				
			
		}
		
	}
	
}
