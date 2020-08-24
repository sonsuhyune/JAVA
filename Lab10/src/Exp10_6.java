import java.util.Scanner;
public class Exp10_6 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("갬블링 게임에 참여할 선수 숫자 >>> ");
		int num = scanner.nextInt();
		Person[] person_array = new Person[num];
		
		for (int i = 0 ;i < num ;i++) {
			System.out.print(i+1+"번째 선수 이름>> ");
			String name = scanner.next();
			person_array[i] = new Person(name);
		}
		int i=0;
		while(true) {
			boolean re = person_array[i%num].play();
			if (re == true) 
				break;
			i++;
		}
		
	}
}
