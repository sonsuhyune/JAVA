import java.util.*;
import java.io.*;
public class Exp12_5 {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		Scanner scan = new Scanner(System.in);
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\user\\Desktop\\2020_����_������\\lab12\\words.txt");
			InputStreamReader in = new InputStreamReader(fin,"US-ASCII");
			Scanner scanner = new Scanner(in);
			
			while(scanner.hasNext()) {
				v.add(scanner.next());
				
			}
			System.out.println("������Ʈ ���� ���� words.txt ������ �о����ϴ�.");
			while(true) {
				int flag =0;
				System.out.print("�ܾ� >> ");
				String input_word = scan.next();
				if(input_word.equals("�׸�")) {
					System.out.println("�����մϴ�...");
					break;
				}
				int check_len = input_word.length();
				for(int i = 0;i<v.size();i++) {
					String v_ = v.get(i);
					if (check_len > v_.length())
						continue;
					String check_v = v_.substring(0,check_len);
					if(check_v.equals(input_word)) {
						System.out.println(v_);
						flag++;
					}
				}
				if(flag == 0)
					System.out.println("�߰��� �� ����");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
