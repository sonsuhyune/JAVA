import java.util.Scanner;
class Dictionary{
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		//return type이 string인데 if에만 string을 return하면 오류난다!-else도 해서 return해줄것
		for(int i = 0;i<kor.length;i++) {
			
			if (kor[i].equals(word)) //주의** string비교할때!!"==" 사용안함!!
				return eng[i];
		}
		return "사전에 없습니다.";
	}
}
public class Exp6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		String input;
		while(true) {
			System.out.print("한글 단어? ");
			input=scanner.next();
			if (input.equals("그만"))
				break;
			System.out.print(input+"은/는 ");
			System.out.println(Dictionary.kor2Eng(input));
			
		}
	}

}
