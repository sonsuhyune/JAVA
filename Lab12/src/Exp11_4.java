import java.io.*;
import java.util.Scanner;
public class Exp11_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean flag=false;
		try {
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("ù��° ���� �̸��� �Է��ϼ��� >> ");
			String first_file = scanner.next();
			System.out.print("�ι�° ���� �̸��� �Է��ϼ��� >> ");
			String second_file = scanner.next();
			System.out.println(first_file+"�� "+second_file+"�� ���մϴ�.");
			File f1 = new File(first_file);
			File f2 = new File(second_file);
			FileReader fr1 = new FileReader(f1);
			FileReader fr2 = new FileReader(f2);
			
			while(true) { 
				int c1 = fr1.read();
				int c2 = fr2.read();
				if (c1 == -1 || c2 == -1) {
					break;
				}
				if ((char)c1 != (char)c2) {
					//System.out.println("������ �ٸ��ϴ�.");
					break;
				}
				flag = true;
				
					
			}
			
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		if(flag == true)
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("������ �ٸ��ϴ�.");
		
	}
}
