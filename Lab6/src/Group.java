import java.util.Scanner;
public class Group { //�̰� �� �׷쿡 ���ѰŶ� �����ϰ� �ۼ��ϱ�
	private char type;
	private Seat[] seat;
	Scanner scanner = new Scanner(System.in);
	public Group(char type, int num)
	{
		this.type= type;
		this.seat=new Seat[num]; //////�̰Ŷ��� ��������!!!!***
		for(int i = 0; i < num ;i++) { //num���� �¼�
			this.seat[i] = new Seat();
		}
	}
	public void reserve() {
		//seat=�¼���ȣ
		show();
		System.out.print("�̸� >>> ");
		String name = scanner.next();
		System.out.print("��ȣ >>> ");
		int seat = scanner.nextInt();
		if(this.seat[seat-1].show_name()==null) //null�� ==�ᵵ ����
		{
			this.seat[seat-1].set_name(name);
		}
	}
	public void delete() {
		show();
		System.out.print("�̸� >> ");
		
		
		String del_name=scanner.next();
		for(int i = 0;i<10;i++) {
			if((this.seat[i].show_name() != null)&&
			(this.seat[i].show_name().equals(del_name))) //null�� equals�� ���Ϸ��ϸ� ��������!!
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
