import java.io.*;
import java.util.Scanner;
public class Exp12_2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		File f = new File("C:\\Users\\user\\Desktop\\2020_����_������\\lab12\\phone.txt");
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		try {
			FileWriter fw = new FileWriter(f);
			
		while(true) {
			System.out.print("�̸� ��ȭ��ȣ >>> ");
			String name = scanner.next();
			if (name.equals("�׸�")) break;
			String num= scanner.next();
			fw.write(name+" "+
			num+"\r\n"); //�ٹٲ�: \r\n
			
		} 
		System.out.println(f.getPath()+"�� �����Ͽ����ϴ�.");
		
		fw.close();
		}
		catch(IOException o) {
			System.out.println(o);
		}
	}
}
