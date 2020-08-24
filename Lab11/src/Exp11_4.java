import java.util.Scanner;
import java.util.ArrayList;
public class Exp11_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<Student>(4);
		System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
		for (int i = 0;i<4;i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			Student new_student = new Student(input);
			al.add(new_student);
		}
		for(int i = 0 ;i < al.size();i++) {
			al.get(i).show(); //주의!!
			
		}
		while(true) {
			System.out.print("학생이름>> ");
			String input_name = scanner.next();
			if (input_name.equals("그만"))
				break;
			for(int i = 0;i<al.size();i++) {
				if(al.get(i).show_name().equals(input_name)) {
					al.get(i).show_with_name();
				}
			}
			
		}
	}
}
