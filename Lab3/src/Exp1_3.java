
public class Exp1_3 {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		do {
			sum+=num;
			num+=2;
		}while(num<100);
		System.out.println("0~99까지의 짝수들의 합은 "+sum+"입니다.");
	}
}
