import java.util.Calendar;
import java.util.Scanner;
public class Exp10_2 {
	
	public static int game(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(name+ "���� <Enter Ű>> ");
		Calendar cal_s = Calendar.getInstance();
		int start = cal_s.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = "+start);
		System.out.print("10�� ���� �� <Enter Ű>> ");
		String enter = scanner.nextLine();
		Calendar cal_e = Calendar.getInstance();
		int end = cal_e.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = "+end);
		if (end-start < 0)
			end += 60;
		return Math.abs(end-start);
	} 
	public static void main(String args[]) {
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		int hwang= game("Ȳ����");
		
		int lee = game("���繮");
		String winner;
		if (Math.abs(hwang - 10) < Math.abs(lee - 10))
			winner = "Ȳ����";
		else
			winner = "���繮";
		System.out.print("Ȳ������ ��� "+hwang+",���繮�� ��� "+lee+", ���ڴ� "+winner);		
	}
}
