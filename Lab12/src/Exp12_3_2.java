import java.io.*;
public class Exp12_3_2 {
	public void main(String args[]) {
		try {
		File f = new File("C:\\\\Users\\\\user\\\\Desktop\\\\2020_����_������\\\\lab12\\\\phone.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine(); //������ readline!!
			if (line==null) break;
			System.out.println(line+"\n");
		}
		br.close();
		 
		}
		catch(IOException d) {
			System.out.println(d);
		}
	}
}
