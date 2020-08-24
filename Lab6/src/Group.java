import java.util.Scanner;
public class Group { //이게 한 그룹에 관한거라 생각하고 작성하기
	private char type;
	private Seat[] seat;
	Scanner scanner = new Scanner(System.in);
	public Group(char type, int num)
	{
		this.type= type;
		this.seat=new Seat[num]; //////이거때매 에러났음!!!!***
		for(int i = 0; i < num ;i++) { //num개의 좌석
			this.seat[i] = new Seat();
		}
	}
	public void reserve() {
		//seat=좌석번호
		show();
		System.out.print("이름 >>> ");
		String name = scanner.next();
		System.out.print("번호 >>> ");
		int seat = scanner.nextInt();
		if(this.seat[seat-1].show_name()==null) //null은 ==써도 가능
		{
			this.seat[seat-1].set_name(name);
		}
	}
	public void delete() {
		show();
		System.out.print("이름 >> ");
		
		
		String del_name=scanner.next();
		for(int i = 0;i<10;i++) {
			if((this.seat[i].show_name() != null)&&
			(this.seat[i].show_name().equals(del_name))) //null을 equals로 비교하려하면 에러난다!!
				this.seat[i].set_name(null);
		}
		
	}
	public void show() {
		System.out.print(this.type+">> ");
		for(int i=0;i<10;i++) {
			if(this.seat[i].show_name() ==null)
				System.out.print("--- ");
			else
				System.out.print(this.seat[i].show_name()+" ");
		}
		System.out.println();
	}
	
	
	
}
