import java.util.Calendar;
import java.util.Scanner;
public class Exp10_2 {
	
	public static int game(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(name+ "시작 <Enter 키>> ");
		Calendar cal_s = Calendar.getInstance();
		int start = cal_s.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = "+start);
		System.out.print("10초 예상 후 <Enter 키>> ");
		String enter = scanner.nextLine();
		Calendar cal_e = Calendar.getInstance();
		int end = cal_e.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = "+end);
		if (end-start < 0)
			end += 60;
		return Math.abs(end-start);
	} 
	public static void main(String args[]) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		int hwang= game("황기태");
		
		int lee = game("이재문");
		String winner;
		if (Math.abs(hwang - 10) < Math.abs(lee - 10))
			winner = "황기태";
		else
			winner = "이재문";
		System.out.print("황기태의 결과 "+hwang+",이재문의 결과 "+lee+", 승자는 "+winner);		
	}
}
