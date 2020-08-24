import java.io.*;
public class Exp12_3_3 {
	public static void main(String args[]) {
		try {
			File f = new File("C:\\\\Users\\\\user\\\\Desktop\\\\2020_여름_객지프\\\\lab12\\\\phone.txt");
			FileReader fr = new FileReader(f);
			System.out.println(f.getPath()+"를 출력합니다.");
			while(true) {
				int c = fr.read();
				if (c == -1) break;
				System.out.print((char)c);
			}
			fr.close();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
