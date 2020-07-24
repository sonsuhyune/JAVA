
public class Exp4_1 {

	public static void main(String[] args) {
		int newArray[][]=new int[4][4];
		for (int i = 0; i<(newArray.length);i++ ) {
			for (int j = 0 ; j < newArray[i].length ; j++) {
				newArray[i][j]=(int)(Math.random()*10+1);
				
			}
		}
		for (int i = 0; i<(newArray.length);i++ ) {
			for (int j = 0 ; j < newArray[i].length ; j++) {
				System.out.print(newArray[i][j]+"	");
				
				
			}
			System.out.println();
		}
		

	}

}
