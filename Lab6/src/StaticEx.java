class ArrayUtil{
	
	static int[] concat(int[] array1, int[] array2) {
		int[] array3= new int[array1.length+array2.length];
		for(int i = 0; i<array1.length;i++) {
			array3[i] = array1[i];
			
		}
		for(int i = 0; i<array2.length;i++) {
			array3[array1.length+i] = array2[i];
			
		}
		return array3;
		
		
	}
	static void print(int[] array) {
		System.out.print("{");
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.print("}");
		
	}
}
public class StaticEx {
	public static void main(String[] arg) {
		//static 부를때는 객체생성안하고 클래스이름.메서드로 부르기!!
		int[] array= {1,5,7,9};
		int[] array2= {3,6,-1,100,77};
		int[] result = ArrayUtil.concat(array,array2);
		ArrayUtil.print(result);
		
	}
	
}
