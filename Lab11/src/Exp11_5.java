import java.util.*;
public class Exp11_5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String,Double>(5);
		System.out.println("�̷����б� ���� �ý����Դϴ�.");
		for(int i = 0;i<5;i++) {
			System.out.print("�̸��� ���� >> ");
			String str= scanner.next();
			double point = scanner.nextDouble();
			hm.put(str,point);
		}
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double line = scanner.nextDouble();
		Set<String> keys=hm.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("���л� ���: ");
		while(it.hasNext()) {
			String name = it.next();
			double p=hm.get(name);
			if (p>line)
				System.out.print(name+" ");
				
				
			
		}
		
	}
}
