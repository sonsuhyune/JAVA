import java.util.Scanner;
import java.util.Vector;
public class Exp11_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> input_vector = new Vector<Integer>();
		System.out.print("���� (-1�� �Էµɶ� ����) >> ");
		while(true) {
			int input = scanner.nextInt();
			if(input == -1)
				break;
			input_vector.add(input);
			
			
		}
		//System.out.println(input_vector.capacity());
		int max=0;
		for(int i =0;i<input_vector.size();i++) {
			if(max<input_vector.get(i))
				max = input_vector.get(i);
		}
		System.out.println("���� ū ���� "+max);

	}

}
