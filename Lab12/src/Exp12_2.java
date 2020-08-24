import java.io.*;
import java.util.Scanner;
public class Exp12_2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		File f = new File("C:\\Users\\user\\Desktop\\2020_여름_객지프\\lab12\\phone.txt");
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			FileWriter fw = new FileWriter(f);
			
		while(true) {
			System.out.print("이름 전화번호 >>> ");
			String name = scanner.next();
			if (name.equals("그만")) break;
			String num= scanner.next();
			fw.write(name+" "+
			num+"\r\n"); //줄바꿈: \r\n
			
		} 
		System.out.println(f.getPath()+"에 저장하였습니다.");
		
		fw.close();
		}
		catch(IOException o) {
			System.out.println(o);
		}
	}
}
