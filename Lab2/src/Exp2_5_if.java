import java.util.Scanner;
public class Exp2_5_if {
	public static void main(String[] args) {
		System.out.print("연산 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int first = scanner.nextInt();
		String math = scanner.next();
		int second = scanner.nextInt();
		int result;
		if (math.equals("+")) {
			result=first+second;
			System.out.println(first+math+second+"의 계산 결과는 "+result);
		}
		else if (math.equals("-")) {
			result=first-second;
			System.out.println(first+math+second+"의 계산 결과는 "+result);
		}
		else if (math.equals("*")) {
			result=first*second;
			System.out.println(first+math+second+"의 계산 결과는 "+result);
		}
		else if (math.equals("/")) {
			if (second==0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
			{
				result=first/second;
				System.out.println(first+math+second+"의 계산 결과는 "+result);
		
			}
		}
		else
			System.out.println("=,-,*,/ 중 하나의 연산자를 사용하세요.");
		scanner.close();	
	}
}
