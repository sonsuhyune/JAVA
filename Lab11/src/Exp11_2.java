import java.util.Scanner;
import java.util.ArrayList;
public class Exp11_2 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for(int i = 0;i<6;i++) {
			al.add(scanner.next());
		}
		double sum = 0;
		for(int i = 0 ;i<al.size();i++) {
			char grade = al.get(i).charAt(0);
			switch (grade){
			case 'A':
				sum+=4.0;
				break;
			case 'B':
				sum+=3.0;
				break;
			case 'C':
				sum+=2.0;
				break;
			case 'D':
				sum+=1.0;
				break;
			case 'F':
				sum+=0.0;
				break;
			default:
				System.out.println("(A/B/C/D/F) �� ������ �Է��ϼ���");
				break;
			}
		}
		System.out.println(sum/al.size());
	}
}
