import java.util.Scanner;
public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public boolean play() { //�̱�� true
		System.out.print("["+name+"]: <<Enter>> ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int[] random_int = new int[3];
		for(int i = 0 ;i < 3;i++) {
			random_int[i]=(int)(Math.random()*3+1);
			System.out.print(random_int[i]+"\t");
		}
		boolean check=true;
		for(int i =0;i<2;i++) {
			if(random_int[i] != random_int[i+1])
				check = false;
		}
		if (check == false) {
			System.out.println("�ƽ�����!");
			return false;
		}
		else {
			System.out.println("Ȳ���� �̰���ϴ�.!");
			return true;
		}
	}
}
