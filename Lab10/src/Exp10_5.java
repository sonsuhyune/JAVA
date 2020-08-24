import java.util.Scanner;
import java.lang.StringBuffer; //lang에 있음!
public class Exp10_5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		String input_sen = scanner.nextLine();
		StringBuffer sb = new StringBuffer(input_sen);
		while(true) {
			System.out.print("명령: ");
			String input = scanner.nextLine(); //nextLine으로 해야함!!
			if(input.equals("그만"))
			{	System.out.println("종료합니다.");
				break;
			}
			String[] input_array=input.split("!");
			//System.out.println(input_array[0].length());
			//System.out.println(input_array[1]);
			if(input_array.length != 2 || input_array[0].length() ==0 ||input_array[1].length() ==0) {
				System.out.println("잘못된 명령입니다.");
				
			} 
			else {
				int where = sb.indexOf(input_array[0]);
				if(where == -1)
					System.out.println("찾을 수 없습니다.");
				else {
					sb.replace(where, where+input_array[0].length(), input_array[1]); 
					//sb는 자동으로 반영됨
					System.out.println(sb);
				}
			}
			
				
			
		}
		
	}
	
}
