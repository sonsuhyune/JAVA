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
			System.out.println("없습니다.");
		else
			System.out.println(work+"입니다.");
	}
}
public class MonthSchedule { //생성자, input(), view(), finish(), run()메서드 작성
	Day[] day;
	Scanner scanner=new Scanner(System.in);
	public MonthSchedule(int how) {
		day=new Day[how];
		for(int i = 0; i < how ;i++) {
			day[i] = new Day();
		}
	}
	public void input() {
		
		System.out.print("날짜 (1~30) >>> ");
		int date  = scanner.nextInt();
		System.out.print("할일 (빈칸없이 입력) >>> ");
		String todo=scanner.next();
		day[date].set(todo);
	}
	
	public void view() {
		System.out.print("날짜 (1~30) >>> ");
		int date  = scanner.nextInt();
		System.out.print(date+"의 할 일은 ");
		day[date].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		
	}
	public void run() {
		System.out.println("이번 달 스케쥴 관리 프로그램.");
		while(true) {
		System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >>> ");
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
				System.out.println("1~3까지의 숫자를 입력하세요");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MonthSchedule schedule = new MonthSchedule(31);
		schedule.run();
	}
}