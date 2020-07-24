import java.util.Scanner;
public class Exp4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Arr_int[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오. >> ");
		
		for (int i = 0; i<10; i++) {
			int input_int= scanner.nextInt();
			Arr_int[i]=input_int;
			
		}
		System.out.print("3의 배수는 ");
		for(int i:Arr_int) {
			
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
}
