import java.util.Scanner;
public class Exp4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Arr_int[] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�. >> ");
		
		for (int i = 0; i<10; i++) {
			int input_int= scanner.nextInt();
			Arr_int[i]=input_int;
			
		}
		System.out.print("3�� ����� ");
		for(int i:Arr_int) {
			
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
}
