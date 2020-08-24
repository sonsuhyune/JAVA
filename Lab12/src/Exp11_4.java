import java.io.*;
import java.util.Scanner;
public class Exp11_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean flag=false;
		try {
			System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
			System.out.print("첫번째 파일 이름을 입력하세요 >> ");
			String first_file = scanner.next();
			System.out.print("두번째 파일 이름을 입력하세요 >> ");
			String second_file = scanner.next();
			System.out.println(first_file+"와 "+second_file+"를 비교합니다.");
			File f1 = new File(first_file);
			File f2 = new File(second_file);
			FileReader fr1 = new FileReader(f1);
			FileReader fr2 = new FileReader(f2);
			
			while(true) { 
				int c1 = fr1.read();
				int c2 = fr2.read();
				if (c1 == -1 || c2 == -1) {
					break;
				}
				if ((char)c1 != (char)c2) {
					//System.out.println("파일이 다릅니다.");
					break;
				}
				flag = true;
				
					
			}
			
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		if(flag == true)
			System.out.println("파일이 같습니다.");
		else
			System.out.println("파일이 다릅니다.");
		
	}
}
