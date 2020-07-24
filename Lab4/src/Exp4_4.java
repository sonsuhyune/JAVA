
public class Exp4_4 {
	public static void main(String[] args) {
		int flag=0;
		int check;
		for (int i = 1 ; i <= 99 ; i++) {
			check = i;
			while(check > 0) {
				
				int re = check % 10;
				if (re == 3 || re == 6|| re== 9) {
					flag+=1;
				}
				check = check / 10;
			}			
			if(flag==1) {
				System.out.print(i);
				System.out.println("¹Ú¼ö Â¦");
			}
			else if(flag == 2) {
				System.out.print(i);
				System.out.println("¹Ú¼ö Â¦Â¦");
			}
			flag=0;
		}
	}

}
