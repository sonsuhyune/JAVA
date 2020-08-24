import java.util.Scanner;
import java.util.HashMap;
public class Exp11_3 {
	public static void main(String args[]) {
		HashMap<String, Integer> nations = new HashMap<String,Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요. (예: korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >>> ");
			String in = scanner.next();
			
			if(in.equals("그만"))
				break;
			int input = scanner.nextInt();
			nations.put(in,input);
		}
		while(true) {
			System.out.print("인구 검색 >>> ");
			String find = scanner.next();
			if (find.equals("그만"))
				break;
			if(nations.get(find) == null)
				System.out.println(find+" 나라는 없습니다.");
			else
				System.out.println(find+"의 인구는 "+nations.get(find));
			
		}
		
	}
}
