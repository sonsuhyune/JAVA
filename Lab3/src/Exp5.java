
public class Exp5 {

	public static void main(String[] args) {
		int Arr_int[] = new int[10];
		int sum=0;
		System.out.print("·£´ýÇÑ Á¤¼öµé ");
		for (int i = 0; i<10;i++) {
			Arr_int[i]=(int) (Math.random()*10 +1);
		}
		for (int i : Arr_int) {
			System.out.print(i + " ");
			sum+=i;
			
		}
		System.out.println();
		System.out.println("Æò±ÕÀº "+((double)sum/(Arr_int.length)));

	}

}
