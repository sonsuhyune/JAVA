
public class Student {
	private String name,major,num;
	private double ave;
	public Student(String input) {
		String[] array = input.split(",");
		this.name = array[0];
		this.major =array[1];
		this.num = array[2];
		this.ave = Double.parseDouble(array[3]); //형변환!!
	}
	public void show() {
		System.out.println("-----------------------------------------------");
		System.out.println("이름: "+name);
		System.out.println("학과: "+major);
		System.out.println("학번: "+num);
		System.out.println("학점 평균: "+ave);
		System.out.println("-----------------------------------------------");
		
	}
	public String show_name() {
		return name;
	}
	public void show_with_name() {
		System.out.println(name+","+major+","+num+","+ave);
	}
}
