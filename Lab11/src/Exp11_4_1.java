import java.util.Scanner;
import java.util.*;
public class Exp11_4_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> al = new HashMap<String,Student>(4);
		System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
		for (int i = 0;i<4;i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			String name =input.split(",")[0];
			Student new_student = new Student(input);
			al.put(name,new_student);
		}
		Set<String> keys = al.keySet(); //key값만 받을 때!
		for(int i = 0 ;i < keys.size();i++) {
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
