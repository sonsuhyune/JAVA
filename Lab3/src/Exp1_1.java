import java.util.Scanner;
public class Exp1_1 {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		while (num<100) {
			sum+=num;
			num+=2;
		}
		System.out.println("0~99까지의 짝수들의 합은 "+sum+"입니다.");
	}
}
