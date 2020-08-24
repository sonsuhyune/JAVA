import java.util.Scanner;
public class StackApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>> ");
		int val = scanner.nextInt();
		StringStack sk = new StringStack(val);
		
		while (true) {
			System.out.print("문자열 입력 >>> ");
			String input = scanner.next();
			if (input.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝 >>> ");
				for(int i = sk.length() ; i> 0 ; i--) {
					System.out.print(sk.pop()+" "); 
				}
				return;
			}
			boolean push_re = sk.push(input);
			if (push_re == false)
				System.out.println("스택이 꽉 차서 푸시 불가 !");
			
		}
		
		
	}
}
