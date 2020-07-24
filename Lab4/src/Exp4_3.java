
public class Exp4_3 {

	public static void main(String[] args) {
		int sum=0;
		if(args.length ==0)
		{
			System.out.println("명령행에 정수들을 입력해주세요.");
			return;
		}
		for (int i = 0 ; i < args.length ; i++) {
			int num = Integer.parseInt(args[i]);
			sum+=num;
		}
		System.out.println(sum/args.length);
	}

}
