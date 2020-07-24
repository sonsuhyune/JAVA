import java.util.Scanner;
public class Exp4_2 {
	public static boolean check(int a[], int num, int index) {
		for (int i = 0 ; i < index ; i ++) {
			if (a[i]==num){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int input = scanner.nextInt();
		boolean result;
		if (input>=100 || input<0) {
			System.out.println("100보다 작은 정수를 입력하세요");
			return;
		}
		int newArray[]=new int[input];
		for (int i = 0 ; i < input ; ) {
			int random_num = (int)(Math.random()*100+1);
			result=check(newArray,random_num, i);
			
			if (result) {
				newArray[i]=random_num;
				i++;
				continue;
			}						
		}		
		for (int i = 0 ; i < input ; i ++) {
			System.out.print(newArray[i]+" ");
		}
		scanner.close();
		
	}
}
