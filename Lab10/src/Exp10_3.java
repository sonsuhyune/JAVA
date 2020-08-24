import java.util.Scanner;
import java.util.StringTokenizer;
public class Exp10_3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {		
			System.out.print(">>> ");
			String input = scanner.nextLine(); //next가 아니라 nextLine!!
			if (input.equals("그만"))
				break;
			StringTokenizer st = new StringTokenizer(input," ");
			
			System.out.println("어절 개수는 "+st.countTokens());
			
		}
	
	}
}
