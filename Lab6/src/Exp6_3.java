import java.util.Scanner;
class Dictionary{
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		//return type�� string�ε� if���� string�� return�ϸ� ��������!-else�� �ؼ� return���ٰ�
		for(int i = 0;i<kor.length;i++) {
			
			if (kor[i].equals(word)) //����** string���Ҷ�!!"==" ������!!
				return eng[i];
		}
		return "������ �����ϴ�.";
	}
}
public class Exp6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		String input;
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			input=scanner.next();
			if (input.equals("�׸�"))
				break;
			System.out.print(input+"��/�� ");
			System.out.println(Dictionary.kor2Eng(input));
			
		}
	}

}
