import java.util.Scanner;
import java.util.ArrayList;
public class Exp11_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<Student>(4);
		System.out.println("�л� �̸�, �а�, �й�, ���� ��� �Է��ϼ���.");
		for (int i = 0;i<4;i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			Student new_student = new Student(input);
			al.add(new_student);
		}
		for(int i = 0 ;i < al.size();i++) {
			al.get(i).show(); //����!!
			
		}
		while(true) {
			System.out.print("�л��̸�>> ");
			String input_name = scanner.next();
			if (input_name.equals("�׸�"))
				break;
			for(int i = 0;i<al.size();i++) {
				if(al.get(i).show_name().equals(input_name)) {
					al.get(i).show_with_name();
				}
			}
			
		}
	}
}
