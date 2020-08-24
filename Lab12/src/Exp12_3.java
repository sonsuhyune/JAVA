import java.util.*;
import java.io.*;
public class Exp12_3{
	public static void main(String args[]) {
		try {
			File f = new File("C:\\\\Users\\\\user\\\\Desktop\\\\2020_여름_객지프\\\\lab12\\\\phone.txt");
			FileReader fr = new FileReader(f);
			System.out.println(f.getPath()+"를 출력합니다.");
			Scanner scanner = new Scanner(fr); //filereader를 scanner가 받아야함
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			fr.close();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		 
		
	}
}
