import java.util.Scanner;
public class Exp10_6 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ӿ� ������ ���� ���� >>> ");
		int num = scanner.nextInt();
		Person[] person_array = new Person[num];
		
		for (int i = 0 ;i < num ;i++) {
			System.out.print(i+1+"��° ���� �̸�>> ");
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
