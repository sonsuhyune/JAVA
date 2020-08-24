import java.util.Scanner;
class Day{
	private String work;
	public void set(String work) {
		this.work = work;
		
	}
	public String get() {
		return work;
	}
	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work+"�Դϴ�.");
	}
}
public class MonthSchedule { //������, input(), view(), finish(), run()�޼��� �ۼ�
	Day[] day;
	Scanner scanner=new Scanner(System.in);
	public MonthSchedule(int how) {
		day=new Day[how];
		for(int i = 0; i < how ;i++) {
			day[i] = new Day();
		}
	}
	public void input() {
		
		System.out.print("��¥ (1~30) >>> ");
		int date  = scanner.nextInt();
		System.out.print("���� (��ĭ���� �Է�) >>> ");
		String todo=scanner.next();
		day[date].set(todo);
	}
	
	public void view() {
		System.out.print("��¥ (1~30) >>> ");
		int date  = scanner.nextInt();
		System.out.print(date+"�� �� ���� ");
		day[date].show();
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	public void run() {
		System.out.println("�̹� �� ������ ���� ���α׷�.");
		while(true) {
		System.out.print("���� (�Է�:1, ����:2, ������:3) >>> ");
			int input = scanner.nextInt();
			if (input == 1) 
				input();
			else if (input == 2)
				view();
			else if (input == 3) {
				finish();
				break;
			    }
			else
				System.out.println("1~3������ ���ڸ� �Է��ϼ���");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MonthSchedule schedule = new MonthSchedule(31);
		schedule.run();
	}
}