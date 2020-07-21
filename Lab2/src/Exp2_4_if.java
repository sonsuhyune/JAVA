import java.util.Scanner;
public class Exp2_4_if {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int input_num=scanner.nextInt();
		if ((input_num >= 3) && (input_num <=5))
			System.out.println("봄");
		else if ((input_num >= 6) && (input_num <=8))
			System.out.println("여름");
		else if ((input_num >= 9) && (input_num <=11))
			System.out.println("가을");
		else if ((input_num == 12) || ((input_num ==2) || (input_num ==1 ))) 
			System.out.println("겨울");
		else
			System.out.println("1~12 사이의 달을 입력하세요");
		scanner.close();
	}
}
