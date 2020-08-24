import java.util.*;
public class Exp11_5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String,Double>(5);
		System.out.println("미래장학금 관리 시스템입니다.");
		for(int i = 0;i<5;i++) {
			System.out.print("이름과 학점 >> ");
			String str= scanner.next();
			double point = scanner.nextDouble();
			hm.put(str,point);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double line = scanner.nextDouble();
		Set<String> keys=hm.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("장학생 명단: ");
		while(it.hasNext()) {
			String name = it.next();
			double p=hm.get(name);
			if (p>line)
				System.out.print(name+" ");
				
				
			
		}
		
	}
}
