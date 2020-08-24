import java.util.Scanner;

class Concert{ //���� �ý��� �޴� ���̱�, ����, ���� �˻�, ���� ���
	String name;
	Scanner scanner = new Scanner(System.in);
	Group S_group;
	Group A_group;
	Group B_group;
	public Concert(String name) {
		this.name = name;
		S_group=new Group('S',10);
		A_group=new Group('A',10);
		B_group=new Group('B',10);
	}
	public void run() {
		System.out.println(name+" ���� �ý����Դϴ�.");
		while (true) {
			System.out.println();
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >>> ");
			int input=scanner.nextInt();
			int num;
			if (input == 1) {
				System.out.print("�¼� ���� S(1), A(2), B(3) >>> ");
				num=scanner.nextInt();
				if (num == 1) S_group.reserve();
				if (num == 2) A_group.reserve();
				if (num == 3) B_group.reserve();
			}
			if (input == 2) {
				
				S_group.show();
				A_group.show();
				B_group.show();
				System.out.println("<<< ��ȸȸ�� �Ϸ��Ͽ����ϴ�. >>>");
			}
			if (input == 3) {
				System.out.print("�¼� ���� S(1), A(2), B(3) >>> ");
				num=scanner.nextInt();
				if (num == 1) S_group.delete();
				if (num == 2) A_group.delete();
				if (num == 3) B_group.delete();
				
			}
			if (input == 4) {
				break;
			}
		}
	}
}