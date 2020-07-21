import java.util.Scanner;
public class Exp2_3 {
	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오 >>");
		Scanner scanner = new Scanner(System.in);
		int input_num = scanner.nextInt();
		int check=0;
		
		
		if ((input_num <= 99) && (input_num >=1)) {
			
			if (((input_num / 10) == 3) || ((input_num / 10) == 6) ||((input_num / 10) == 6))
				check+=1;
			if ((input_num % 10) == 3 || ((input_num % 10) == 6) || ((input_num % 10) == 9))
				check+=1;
			
			if (check == 1)
				System.out.println("박수짝");
			else if (check ==2)
				System.out.println("박수짝짝");
			else
				System.out.println("박수없음");
		}
		else
			System.out.println("1~99사이의 정수를 입력하세요!");
		scanner.close();
		
			
	}
}
