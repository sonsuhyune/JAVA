import java.util.Scanner;

class Concert{ //예약 시스템 메뉴 보이기, 예약, 예약 검색, 예약 취소
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
		System.out.println(name+" 예약 시스템입니다.");
		while (true) {
			System.out.println();
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>> ");
			int input=scanner.nextInt();
			int num;
			if (input == 1) {
				System.out.print("좌석 구분 S(1), A(2), B(3) >>> ");
				num=scanner.nextInt();
				if (num == 1) S_group.reserve();
				if (num == 2) A_group.reserve();
				if (num == 3) B_group.reserve();
			}
			if (input == 2) {
				
				S_group.show();
				A_group.show();
				B_group.show();
				System.out.println("<<< 조회회를 완료하였습니다. >>>");
			}
			if (input == 3) {
				System.out.print("좌석 구분 S(1), A(2), B(3) >>> ");
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