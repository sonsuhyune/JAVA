import java.util.*;
import java.io.*;
public class Exp12_3{
	public static void main(String args[]) {
		try {
			File f = new File("C:\\\\Users\\\\user\\\\Desktop\\\\2020_����_������\\\\lab12\\\\phone.txt");
			FileReader fr = new FileReader(f);
			System.out.println(f.getPath()+"�� ����մϴ�.");
			Scanner scanner = new Scanner(fr); //filereader�� scanner�� �޾ƾ���
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
